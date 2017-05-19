package com.rd22.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rd22.auth.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
