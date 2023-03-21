package com.example.eshope.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eshope.entities.UserInformations;

public interface UserInformationsRepository extends JpaRepository<UserInformations, Integer>{
    
}
