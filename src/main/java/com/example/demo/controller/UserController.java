package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/add/{id}/{name}/{address}")
    public User addUser(@PathVariable int id, @PathVariable String name,
                        @PathVariable String address){
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setAddress(address);
        userService.saveUser(user);
        return user;
    }

    @RequestMapping(value = "delete/{id}")
    public void deleteUser(@PathVariable int id){
        userService.delete(id);
    }

    @RequestMapping(value ="/")
    public List<User> getAllUser(){
        return userService.findAll();
    }

    @RequestMapping(value = "/{id}")
    public User getUser(@PathVariable int id){
        Optional<User> Ouser = userService.findOne(id);
        User user = Ouser.get();
        return user;
    }

    @RequestMapping(value = "/search/name/{name}")
    public List<User> getUserByName(@PathVariable String name)
    {
        List<User> users = userService.findByName(name);
        return users;
    }

}
