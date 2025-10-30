package com.hr.hr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hr.hr.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
