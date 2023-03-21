package com.example.eshope.Repository;

import com.example.eshope.entities.Utilisateur;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Utilisateur, Long> {
}
