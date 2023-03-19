package com.example.qm.fizzbuzz.client;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzClientTest {
    @Test
    public void testFizzBuzzVonSechsZuElf() {
        FizzBuzzClient fizzBuzzClient = new FizzBuzzClient();
        
        String result = fizzBuzzClient.getResultForScope(6, 11);

        Assert.assertEquals("Fizz, 7, 8, Fizz, Buzz, 11", result);
    }
}
