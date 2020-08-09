package com.example.demo.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ResultServiceTest {

    @Test
    void speedOfWaterShouldReturnGoodValue(){

        ResultService resultService = new ResultService();
        //units [m, m, m3/s]
        Double result=resultService.speedOfWater(100,5.0,50.0);
        assertEquals(0.707,result);

    }

    @Test
    void returnTrueAfterEquationTwoNumbers(){

        ResultService resultService = new ResultService();

        assertTrue(resultService.equalsValue(0.707,0.707));
        assertTrue(resultService.equalsValue(0.707,0.707132));
    }

    @Test
    void returnFalseAfterEquationTwoNumbers(){

        ResultService resultService = new ResultService();

        assertFalse(resultService.equalsValue(0.708,0.707));
        assertFalse(resultService.equalsValue(0.707,0.907132));
    }

}