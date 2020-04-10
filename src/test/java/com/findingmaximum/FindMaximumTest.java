package com.findingmaximum;
import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest
{
    FindMaximum findMaximum=new FindMaximum();
    /* If first number is maximum then should return maximum number*/
    @Test
    public void givenThreeIntegers_WhenFirstMax_ThenReturnTrue()
    {
        int maximum=findMaximum.findingMaximum(30,20,10);
        Assert.assertEquals(30,maximum);
    }

    /*If Second number is maximum then should return maximum number*/
    @Test
    public void givenThreeIntegers_WhenSecondMax_ThenReturnTrue()
    {
        int maximum=findMaximum.findingMaximum(20,30,10);
        Assert.assertEquals(30,maximum);
    }

    /* If Third number is maximum then should return maximum number*/
    @Test
    public void givenThreeIntegers_WhenThirdMax_ThenReturnTrue()
    {
        int maximum=findMaximum.findingMaximum(30,20,30);
        Assert.assertEquals(30,maximum);
    }

    /* If first number is maximum then should return maximum number */
    @Test
    public void givenThreeFloat_WhenFirstMax_ThenReturnTrue()
    {
        Float maximum=findMaximum.findingFloatMaximum(30.0f,20.0f,10.0f);
        Assert.assertEquals((Float)30.0f,maximum);
    }

    /* If second number is maximum then should return maximum number*/
    @Test
    public void givenThreeFloat_WhenSecondMax_ThenReturnTrue()
    {
        Float maximum=findMaximum.findingFloatMaximum(10.0f,30.0f,20.0f);
        Assert.assertEquals((Float)30.0f,maximum);
    }

    /*If third number is maximum then should return maximum number*/
    @Test
    public void givenThreeFloat_WhenThirdMax_ThenReturnTrue()
    {
        Float maximum=findMaximum.findingFloatMaximum(20.0f,30.0f,30.0f);
        Assert.assertEquals((Float)30.0f,maximum);
    }
}
