package com.example.eshope.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eshope.entities.Command; 

public interface CommandRepository extends JpaRepository<Command, Long>{
    
}
