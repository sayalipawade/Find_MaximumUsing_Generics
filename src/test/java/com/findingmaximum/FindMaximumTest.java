package com.findingmaximum;
import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTest
{
    /* If first number is maximum then should return maximum number*/
    @Test
    public void givenThreeIntegers_WhenFirstMax_ThenReturnTrue()
    {
        FindMaximum findMaximum=new FindMaximum(30,20,10);
        Integer maximum=(Integer)findMaximum.getMaximumValue();
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

    /*Given Integer numbers should return maximum number*/
    @Test
    public void GivenIntegerNumber_ShouldReturnMaximumNumber()
    {
        FindMaximum findMaximum=new FindMaximum();
        Integer lastElement=(Integer)findMaximum.getMaximumValue(50,10,20,30,40,60);
        Assert.assertEquals((Integer)60,lastElement);
    }

    /*Given Float numbers Should return maximum number */
    @Test
    public void GivenFloatNumber_ShouldReturnMaximumNumber()
    {
        FindMaximum findMaximum=new FindMaximum();
        Float lastElement=(Float)findMaximum.getMaximumValue(10.20f,50.10f,30.20f,70.10f,80.50f);
        Assert.assertEquals((Float)80.50f,lastElement);
    }

    /*Given String values should return maximum value */
    @Test
    public void GivenStringValues_ShouldReturnMaximumValue()
    {
        FindMaximum findMaximum=new FindMaximum();
        String lastElement=(String)findMaximum.getMaximumValue("ABC","PQR","XYZ","LMN","PST","POD");
        Assert.assertEquals((String)"XYZ",lastElement);
    }
}
