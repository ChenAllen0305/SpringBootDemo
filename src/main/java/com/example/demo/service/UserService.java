package com.example.demo.service;

import com.example.demo.domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    public List<User> findAll();

    public void saveUser(User book);

    public Optional<User> findOne(long id);

    public void delete(long id);

    public List<User> findByName(String name);
}
