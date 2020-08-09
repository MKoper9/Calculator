package com.example.demo.controller;

import com.example.demo.service.ResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private ResultService resultService;

    @Autowired
    public UserController(ResultService resultService) {
        this.resultService = resultService;
    }

    @PostMapping("/")
    public Double index(Integer diameter,Double thickness,Double stream){
        return resultService.speedOfWater(diameter,thickness,stream);
    }





}
