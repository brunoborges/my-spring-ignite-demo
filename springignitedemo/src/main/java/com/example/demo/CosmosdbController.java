package com.example.demo;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cosmosdb")
public class CosmosdbController {

    @Autowired
    private UserRepository repository;

    @GetMapping(value = "/users")
    public List<User> getUsers() {
        return Lists.newArrayList(this.repository.findAll());
    }

    @PostMapping(value = "/user")
    public User putUser(@RequestBody User user) {
        return this.repository.save(user);
    }
}
