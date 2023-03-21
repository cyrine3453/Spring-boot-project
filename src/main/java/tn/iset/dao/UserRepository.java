package tn.iset.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.iset.entities.User;

public interface UserRepository extends JpaRepository<User, String>{
    
}
