package com.freestarmobile.app.ws.controllers;

import com.freestarmobile.app.ws.models.requests.UserDetailsRequestModel;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users") // http://localhost:8080/users
public class UserController {

    @GetMapping()
    public String getUser(){
        return "get user was called";
    }

    @PostMapping
    public String createUser(@RequestBody UserDetailsRequestModel userDetails){
        return "create user was called";
    }

    @PutMapping
    public String updateUser(){
        return "update user was called";
    }

    @DeleteMapping
    public String deleteUser(){
        return "delete user was called";
    }

}
