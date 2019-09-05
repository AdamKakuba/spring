package com.kakuba.videoapp;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTests {

    @Test
    public void should_add_two_numbers(){
        //given
        Calculator calculator = new Calculator();

        //when
        Assert.assertEquals(calculator.add(2,4),6);
        Assert.assertEquals(calculator.add(-10,4),-6);
        Assert.assertEquals(calculator.add(-1,-3),-4);

    }
    @Test
    public void should_no_add_two_numbers(){
        //given
        Calculator calculator = new Calculator();

        //when
        Assert.assertNotEquals(calculator.add(10,20),25);
        //Assert.assertNotEquals(calculator.add(-10,4),-6);
        //Assert.assertNotEquals(calculator.add(-1,-3),-4);

    }

    @Test
    public void should_divide_two_numbers(){
        //given
        Calculator calculator = new Calculator();

        //when
        Assert.assertEquals(calculator.divide(100,10),10,0);

    }

    @Test(expected = ArithmeticException.class)
    public void should_no_divide_two_numbers(){
        //given
        Calculator calculator = new Calculator();

        //when
        Assert.assertEquals(calculator.divide(100,0),10,0);

    }




}
