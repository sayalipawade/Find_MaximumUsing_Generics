package com.findingmaximum;
import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest
{
    FindMaximum findMaximum=new FindMaximum(10,20,10);
    /* If first number is maximum then should return maximum number*/
    @Test
    public void givenThreeIntegers_WhenFirstMax_ThenReturnTrue()
    {
        FindMaximum findMaximum=new FindMaximum(30,20,10);
        Integer maximum=(Integer) findMaximum.getMaximumValue();
        Assert.assertEquals((Integer)30,maximum);
    }

    /*If Second number is maximum then should return maximum number*/
    @Test
    public void givenThreeIntegers_WhenSecondMax_ThenReturnTrue()
    {
        FindMaximum findMaximum=new FindMaximum(20,30,10);
        Integer maximum=(Integer) findMaximum.getMaximumValue();
        Assert.assertEquals((Integer) 30,maximum);
    }

    /* If Third number is maximum then should return maximum number*/
    @Test
    public void givenThreeIntegers_WhenThirdMax_ThenReturnTrue()
    {
        FindMaximum findMaximum=new FindMaximum(20,10,30);
        Integer maximum=(Integer) findMaximum.getMaximumValue();
        Assert.assertEquals((Integer)30,maximum);
    }

    /* If first number is maximum then should return maximum number */
    @Test
    public void givenThreeFloat_WhenFirstMax_ThenReturnTrue()
    {
        FindMaximum findMaximum=new FindMaximum(30.0f,20.0f,10.0f);
        Float maximum=(Float)findMaximum.getMaximumValue();
        Assert.assertEquals((Float)30.0f,maximum);
    }

    /* If second number is maximum then should return maximum number*/
    @Test
    public void givenThreeFloat_WhenSecondMax_ThenReturnTrue()
    {
        FindMaximum findMaximum=new FindMaximum(10.0f,30.0f,20.0f);
        Float maximum=(Float) findMaximum.getMaximumValue();
        Assert.assertEquals((Float)30.0f,maximum);
    }

    /*If third number is maximum then should return maximum number*/
    @Test
    public void givenThreeFloat_WhenThirdMax_ThenReturnTrue()
    {
        FindMaximum findMaximum=new FindMaximum(20.0f,10.0f,30.0f);
        Float maximum=(Float) findMaximum.getMaximumValue();
        Assert.assertEquals((Float)30.0f,maximum);
    }

    /* If first string is maximum then should return maximum */
    @Test
    public void givenThreeString_WhenFirstMax_ThenReturnTrue()
    {
        FindMaximum findMaximum=new FindMaximum("ABC","XYZ","PQR");
        String maximum=(String) findMaximum.getMaximumValue();
        Assert.assertEquals("XYZ",maximum);
    }

    /* If second string is maximum then should return maximum*/
    @Test
    public void givenThreeString_WhenSecondtMax_ThenReturnTrue()
    {
        FindMaximum findMaximum=new FindMaximum("PQR","XYZ","ABC");
        String maximum=(String)findMaximum.getMaximumValue();
        Assert.assertEquals("XYZ",maximum);
    }

    /* If third string is maximum then should return maximum*/
    @Test
    public void givenThreeString_WhenThirdMax_ThenReturnTrue()
    {
        FindMaximum findMaximum=new FindMaximum("PQR","ABC","XYZ");
        String maximum=(String) findMaximum.getMaximumValue();
        Assert.assertEquals("XYZ",maximum);
    }

}
