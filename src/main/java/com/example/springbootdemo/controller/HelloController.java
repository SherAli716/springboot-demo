package com.example.springbootdemo.controller;

import com.example.springbootdemo.entity.Department;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/")
    public String helloworld(){
       return "Hello , I am hello controller hello ";
    }


}
