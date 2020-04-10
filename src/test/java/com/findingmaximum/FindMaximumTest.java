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
    public void givenThreeIntegers_WhenMax_ThenReturnTrue()
    {
        int maximum=findMaximum.findingMaximum(10,20,30);
        Assert.assertEquals(30,maximum);
    }
}
