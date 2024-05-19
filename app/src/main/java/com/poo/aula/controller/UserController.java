package com.poo.aula.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poo.aula.exception.UserNotFoundException;
import com.poo.aula.model.User;
import com.poo.aula.service.UserService;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping(value="/api/users/")
@AllArgsConstructor
public class UserController {
    
    @Autowired
    UserService userService;

    @GetMapping("all/")
    public List<User> getUsers() {
        return userService.findAllUsers();
    }

    @GetMapping("{id}/")
    public User getUserById(@PathVariable("id") Long id) {
        try {
            return userService.findUserById(id);
        } catch (UserNotFoundException e) {
            return null;
        } 
    }

    @PostMapping("add/")
    public void insertUser(@RequestBody User user){
        userService.insertUser(user);
    }
}
