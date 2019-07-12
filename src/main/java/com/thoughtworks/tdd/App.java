package com.thoughtworks.tdd;

public class App {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        for( int i = 0; i < 120; i++) {
            String result = fizzBuzz.convert(i+1);
            System.out.println(result);
        }
    }
}
