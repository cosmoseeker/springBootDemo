package com.example.controller;

import com.example.dao.UserDao;
import com.example.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
//@EnableAutoConfiguration
public class UserController {

    @Autowired
    private UserDao userDao;

    public static void main(String[] args) {
        SpringApplication.run(UserController.class, args);
    }

    @RequestMapping("/")
    public String index() {
        return "Hello";
    }

    @RequestMapping("/{id}")
    public String getUser(@PathVariable("id") int id) {
        User user = userDao.selectUserById(id);
        return user.toString();
    }
}
