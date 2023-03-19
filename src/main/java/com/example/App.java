package com.example;

import com.example.qm.fizzbuzz.service.FizzBuzzService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        FizzBuzzService fizzBuzzService = new FizzBuzzService();

        for (int i = 0; i < 20; i++) {
            System.out.println(fizzBuzzService.getResultOfNumber(i));
        }

    }
}
