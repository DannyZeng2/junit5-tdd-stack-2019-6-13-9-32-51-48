package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;


public class FizzBuzzTest {

    @Test
    public void should_return_1_when_number_is_1(){
        //Given
        int number = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String convert = fizzBuzz.convert(number);
        //Then
        assertEquals(convert,"1");
    }

    @Test
    public void should_return_2_when_number_is_2(){
        //Given
        int number = 2;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String convert = fizzBuzz.convert(number);
        //Then
        assertEquals(convert,"2");
    }

    @Test
    public void should_return_Fizz_when_number_is_3(){
        //Given
        int number = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String convert = fizzBuzz.convert(number);
        //Then
        assertEquals(convert,"Fizz");
    }

    @Test
    public void should_return_Fizz_when_number_is_6(){
        //Given
        int number = 6;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String convert = fizzBuzz.convert(number);
        //Then
        assertEquals(convert,"Fizz");
    }

    @Test
    public void should_return_Buzz_when_number_is_5(){
        //Given
        int number = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String convert = fizzBuzz.convert(number);
        //Then
        assertEquals(convert,"Buzz");
    }

    @Test
    public void should_return_Buzz_when_number_is_10(){
        //Given
        int number = 10;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String convert = fizzBuzz.convert(number);
        //Then
        assertEquals(convert,"Buzz");
    }

    @Test
    public void should_return_Whizz_when_number_is_7(){
        //Given
        int number = 7;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String convert = fizzBuzz.convert(number);
        //Then
        assertEquals(convert,"Whizz");
    }

    @Test
    public void should_return_Fizz_when_number_is_14(){
        //Given
        int number = 14;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String convert = fizzBuzz.convert(number);
        //Then
        assertEquals(convert,"Whizz");
    }

    @Test
    public void should_return_FizzBuzz_when_number_is_15(){
        //Given
        int number = 15;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String convert = fizzBuzz.convert(number);
        //Then
        assertEquals(convert,"FizzBuzz");
    }

    @Test
    public void should_return_FizzBuzz_when_number_is_30(){
        //Given
        int number = 30;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String convert = fizzBuzz.convert(number);
        //Then
        assertEquals(convert,"FizzBuzz");
    }

    @Test
    public void should_return_FizzWhizz_when_number_is_21(){
        //Given
        int number = 21;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String convert = fizzBuzz.convert(number);
        //Then
        assertEquals(convert,"FizzWhizz");
    }

    @Test
    public void should_return_FizzWhizz_when_number_is_42(){
        //Given
        int number = 21;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String convert = fizzBuzz.convert(number);
        //Then
        assertEquals(convert,"FizzWhizz");
    }

    @Test
    public void should_return_BuzzWhizz_when_number_is_35(){
        //Given
        int number = 35;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String convert = fizzBuzz.convert(number);
        //Then
        assertEquals(convert,"BuzzWhizz");
    }

    @Test
    public void should_return_BuzzWhizz_when_number_is_70(){
        //Given
        int number = 70;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String convert = fizzBuzz.convert(number);
        //Then
        assertEquals(convert,"BuzzWhizz");
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_number_is_105(){
        //Given
        int number = 105;
        FizzBuzz fizzBuzz = new FizzBuzz();
        //When
        String convert = fizzBuzz.convert(number);
        //Then
        assertEquals(convert,"FizzBuzzWhizz");
    }

}
