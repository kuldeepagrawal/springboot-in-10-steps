package com.in28minutes.springboot.basics.springbootin10steps.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.springboot.basics.springbootin10steps.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
