package com.example.eshope.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eshope.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    
}
