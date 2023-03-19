package com.example.qm.fizzbuzz.client;

import com.example.qm.fizzbuzz.service.FizzBuzzService;

public class FizzBuzzClient {

    public String getResultForScope(int begin, int end) {
        FizzBuzzService fizzBuzzService = new FizzBuzzService();
        StringBuilder result = new StringBuilder();

        for (int i = begin; i <= end; i++) {
            if (i == end) {
                result.append(fizzBuzzService.getResultOfNumber(i));
            } else {
                result.append(fizzBuzzService.getResultOfNumber(i) + ", ");
            }
        }

        return result.toString();
    }
    
}
