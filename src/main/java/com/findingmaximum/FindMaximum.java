package com.findingmaximum;
public class FindMaximum
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to finding maximum");
    }

    //Finding maximum between three integers
    public Integer findingMaximum(Integer firstNumber,Integer secondNumber,Integer thirdNumber)
    {
        int maxNumber=firstNumber;
        if(secondNumber.compareTo(maxNumber)>0)
        {
            maxNumber=secondNumber;
        }
        else if(thirdNumber.compareTo(maxNumber)>0)
        {
            maxNumber=thirdNumber;
        }
        return maxNumber;
    }

    //Finding maximum between three float numbers
    public Float findingFloatMaximum(Float firstNumber,Float secondNumber,Float thirdNumber)
    {
        float maxNumber=firstNumber;
        if(secondNumber.compareTo(maxNumber)>0)
        {
            maxNumber=secondNumber;
        }
        else if(thirdNumber.compareTo(maxNumber)>0)
        {
            maxNumber=thirdNumber;
        }
        return maxNumber;
    }

    //finding maximum between three String
    public String findingStringMaximum(String firstString,String secondString,String thirdString)
    {
        String maxString=firstString;
        if(secondString.compareTo(maxString)>0)
        {
            maxString=secondString;
        }
        else if(thirdString.compareTo(maxString)>0)
        {
            maxString=thirdString;
        }
        return maxString;
    }
}
