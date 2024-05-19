package com.poo.aula.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poo.aula.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    
    public User findByEmail(String email);
    public List<User> findByAge(Short age);
}
