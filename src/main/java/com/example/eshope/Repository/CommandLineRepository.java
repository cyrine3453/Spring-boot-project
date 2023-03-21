package com.example.eshope.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.eshope.entities.CommandLine;

public interface CommandLineRepository extends JpaRepository<CommandLine, Integer> {
    
}
