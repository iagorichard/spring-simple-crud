package com.poo.aula.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.poo.aula.demo.model.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long>{

}