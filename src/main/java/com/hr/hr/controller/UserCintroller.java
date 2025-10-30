package com.hr.hr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hr.hr.dto.UserDTO;
import com.hr.hr.model.User;
import com.hr.hr.service.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/users")
public class UserCintroller {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity <User> createUser(@Valid @RequestBody UserDTO dto)
    {
        return ResponseEntity.ok(userService.CreateUser(dto));
    }
}
