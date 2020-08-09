package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class PipeService {

    public Double speedOfWater(Integer diameter, Double thickness, Double stream) {
//        if (diameter < 2 * thickness) {
//            return false;
//        }

        Double speed = stream/(((double)diameter-2*thickness)*Math.PI/4);
        return speed;
    }

}
