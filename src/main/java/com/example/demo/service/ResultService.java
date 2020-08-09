package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ResultService {

    public Double speedOfWater(Integer diameter, Double thickness, Double stream) {
//        if (diameter < 2 * thickness) {
//            return false;
//        }

        Double speed = stream/(((double)diameter-2*thickness)*Math.PI/4);
        return speed;
    }

    public boolean equalsValue(double val1, double val2)
    {
        Double temp1 = val1*1000;
        Double temp2 = val2*1000;

        boolean result= temp1.equals(temp2);
        return result;
    }

}
