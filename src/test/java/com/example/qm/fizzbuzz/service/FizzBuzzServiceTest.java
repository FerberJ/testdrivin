package com.example.qm.fizzbuzz.service;

import org.junit.Test;
import org.junit.Assert;

public class FizzBuzzServiceTest {
    
    @Test
    public void pruefNormaleZahl() {
        String result;
        FizzBuzzService fizzBuzzService = new FizzBuzzService();
        result = fizzBuzzService.getResultOfNumber(2);
        Assert.assertEquals("2", result);
    }

    @Test
    public void pruefeDurchDreiTeilbareZahl() {
        FizzBuzzService fizzBuzzService = new FizzBuzzService();
        var result = fizzBuzzService.getResultOfNumber(3);
        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void pruefeDurchFuenfTeilbareZahl() {
        FizzBuzzService fizzBuzzService = new FizzBuzzService();
        var result = fizzBuzzService.getResultOfNumber(5);
        Assert.assertEquals("Buzz", result);
    }

    @Test
    public void pruefeDurchFuenfUndDreiTeilbareZahl() {
        FizzBuzzService fizzBuzzService = new FizzBuzzService();
        var result = fizzBuzzService.getResultOfNumber(15);
        Assert.assertEquals("FizzBuzz", result);
    }
}
