package com.hr.hr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.hr.dto.UserDTO;
import com.hr.hr.model.User;
import com.hr.hr.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User CreateUser(UserDTO dto)
    {
        User user = User.builder()
                   .name(dto.getName())
                   .age(dto.getAge())
                   .email(dto.getEmail())
                   .build();
        return userRepository.save(user);
    }

}
