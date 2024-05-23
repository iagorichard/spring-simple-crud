package com.poo.aula.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poo.aula.demo.model.Pet;
import com.poo.aula.demo.service.PetService;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(value = "api/pets/")
@AllArgsConstructor
public class PetController{

    @Autowired
    private PetService petService;

    @GetMapping("all")
    public List<Pet> getPets(){
        return petService.getAllPets();
    }

    @PostMapping("add")
    public void insertPet(@RequestBody Pet pet){
        petService.insertPet(pet);
    }


}