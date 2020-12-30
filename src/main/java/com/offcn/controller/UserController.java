package com.offcn.controller;

import com.offcn.pojo.User;
import com.offcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<User> getUserList(){
        return userService.getUserList();
    }

    @GetMapping("/{id}")
    public User getOne(@PathVariable("id") Integer id){
        return userService.getOne(id);
    }

    @PostMapping("/")
    public String addUser(User user){
        userService.addUser(user);
        return "success";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") Integer id){
        userService.deleteUser(id);
        return "success";
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable("id") Integer id,User user){
        userService.updateUser(id,user);
        return "success";
    }
}
