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
}
