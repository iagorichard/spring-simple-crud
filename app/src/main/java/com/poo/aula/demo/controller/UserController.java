package com.poo.aula.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poo.aula.demo.exception.UserNotFoundException;
import com.poo.aula.demo.model.User;
import com.poo.aula.demo.service.UserService;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(value = "api/users/")
@AllArgsConstructor
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("all")
    public List<User> getUsers() {
        return userService.findAllUsers();
    }

    @GetMapping("{id}")
    public User getUserById(@PathVariable("id") Long id) {
        try {
            return userService.findUserById(id);
        } catch (UserNotFoundException e) {
            return null;
        }
    }

    @PostMapping("add")
    public void insertUser(@RequestBody User user){
        userService.insertUser(user);
    }

    @PutMapping("update/{id}/{name}")
    public boolean updateNameById(@PathVariable("id") Long id, @PathVariable("name") String name){
        try{
            userService.updateNameById(id, name);
            return true;
        } catch (UserNotFoundException e) {
            return false;
        }
    }

    @DeleteMapping("delete/{id}")
    public boolean deleteUserById(@PathVariable("id") Long id){
        try{
            userService.deleteUserById(id);
            return true;
        } catch (UserNotFoundException e) {
            return false;
        }
    }
}
