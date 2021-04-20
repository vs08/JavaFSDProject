package com.example.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
