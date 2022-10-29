package com.Bridgelabz.Day13FindMaxUsingGenerics;

import org.junit.Assert;
import org.junit.Test;

public class GenericsTest {
    //UC1-------------------------------------Compare 3 Integers----------------------------------------
    //TC1.1 = Given Max Number at
    //1st Position return the
    //Same Number
    @Test
    public void checkMaxNumberAt1stPositionReturnSameNumber() {
        Generics campareInterger = new Generics(500,200,50);
        Assert.assertEquals(500,campareInterger.maximum());
    }

    //TC1.2 = Given Max Number at
    //2nd Position return the
    //Same Number
    @Test
    public void checkMaxNumberAt2ndPositionReturnSameNumber() {
        Generics campareInterger = new Generics(50,200,30);
        Assert.assertEquals(200,campareInterger.maximum());
    }

    //TC1.3 = Given Max Number at
    //3rd Position return the
    //Same Number
    @Test
    public void checkMaxNumberAt3rdPositionReturnSameNumber() {
        Generics campareInterger = new Generics(50,20,300);
        Assert.assertEquals(300,campareInterger.maximum());
    }


    //UC2-------------------------------------Compare 3 Float----------------------------------------
    //TC2.1 = Given Max Number at
    //1st Position return the
    //Same Number
    @Test
    public void checkMaxFloatNumberAt1stPositionReturnSameNumber() {
        Generics campareFloat = new Generics(15.6f,2.2f,3.6f);
        Assert.assertEquals(15.6f,campareFloat.maximum());
    }

    //TC2.2 = Given Max Number at
    //2nd Position return the
    //Same Number
    @Test
    public void checkMaxFloatNumberAt2ndPositionReturnSameNumber() {
        Generics campareFloat = new Generics(15.6f,22.2f,3.6f);
        Assert.assertEquals(22.2f,campareFloat.maximum());
    }

    //TC2.3 = Given Max Number at
    //3rd Position return the
    //Same Number
    @Test
    public void checkMaxFloatNumberAt3rdPositionReturnSameNumber() {
        Generics campareFloat = new Generics(15.6f,2.2f,33.6f);
        Assert.assertEquals(33.6f,campareFloat.maximum());
    }
}
