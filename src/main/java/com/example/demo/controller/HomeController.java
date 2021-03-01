package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author liubo
 * @date 2021/3/1
 */
@RequestMapping("/")
@RestController
public class HomeController {

    @GetMapping
    public String home() {
        return "home: " + new Date();
    }
}

