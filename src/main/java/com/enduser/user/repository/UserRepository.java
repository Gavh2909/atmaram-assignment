package com.enduser.user.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enduser.user.model.User;

public interface UserRepository  extends JpaRepository<User, Integer>{


	Optional<User> findByUsername(String username);
    
}
