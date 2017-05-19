package com.rd22.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rd22.auth.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
