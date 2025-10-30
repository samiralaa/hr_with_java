package com.hr.hr.dto;
import lombok.*;
import jakarta.validation.constraints.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDTO {

   private Long id;
   @NotBlank(message = "name is requerid")
   @Size(min =2 ,max = 50 ,message = "name must bettwen 2 to 50 ")
   private String name;

   @Email(message = "muest be valid")
   @NotBlank(message = "email is requerid")
   private String email;

   @Max(value = 80 ,message = "max cannt be 80")
   @Min(value = 10 ,message = "min cant be 10")
   private int age;
}
