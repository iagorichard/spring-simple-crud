package com.poo.aula.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poo.aula.demo.model.Pet;
import com.poo.aula.demo.model.User;
import com.poo.aula.demo.repository.PetRepository;
import com.poo.aula.demo.repository.UserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PetService {

    @Autowired
    private PetRepository petRepository;

    @Autowired
    private UserRepository userRepository;

    public List<Pet> getAllPets() {
        return petRepository.findAll();
    }

    public void insertPet(Pet pet) {
        Optional<User> owner = userRepository.findById(pet.getOwner().getId());

        if (owner.isPresent()){
            pet.setOwner(owner.get());
            petRepository.save(pet);
        }
    }
}