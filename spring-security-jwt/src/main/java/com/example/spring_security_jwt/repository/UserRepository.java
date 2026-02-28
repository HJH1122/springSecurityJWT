package com.example.spring_security_jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring_security_jwt.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer>{

    Boolean existsByUsername(String username);

}
