package com.hr.hr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hr.hr.dto.UserDTO;
import com.hr.hr.exception.UserNotFoundException;
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

    public List<User> GetAllUser()
    {
        return userRepository.findAll();
    }
    public User getOneUser(Long id)
    {
        return userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
    }

    public User updateUser(Long id, UserDTO dto)
    {
        User existUser = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));

        existUser.setAge(dto.getAge());
        existUser.setName(dto.getName());
        existUser.setEmail(dto.getEmail());
        return userRepository.save(existUser);
    }

    public void deleteUser(Long id)
    {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
        userRepository.delete(user);
    }

}
