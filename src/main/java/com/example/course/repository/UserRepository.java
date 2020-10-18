package com.example.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
