package com.findingmaximum;

import java.util.Arrays;
import java.util.Collections;

public class FindMaximum <T extends Comparable<T>>
{
    //variables
    T firstVariable;
    T secondVariable;
    T ThirdVariable;

    //Default constructor
    public FindMaximum() { }

    //set instance variable using constructor
    public FindMaximum(T firstVariable,T secondVariable,T thirdVariable)
    {
        this.firstVariable=firstVariable;
        this.secondVariable=secondVariable;
        this.ThirdVariable=thirdVariable;
    }

    //main method
    public static void main(String[] args)
    {
        System.out.println("Welcome to finding maximum");
    }

    //finding maximum value
    public <T extends Comparable <T>>  T getMaximumValue(T firstValue,T secondValue,T thirdValue,T...arguments)
    {
        T maxResult=firstValue;
        if(secondValue.compareTo(maxResult)>0)
        {
            maxResult=secondValue;
        }
        if(thirdValue.compareTo(maxResult)>0)
        {
            maxResult=thirdValue;
        }
        if (arguments.length!=0)
        {
            Arrays.sort(arguments, Collections.reverseOrder());
            if(maxResult.compareTo(arguments[0]) < 0)
            {
                maxResult=arguments[0];
            }
        }
        return maxResult;
    }

    //pass instance variable
    public T getMaximumValue()
    {
        T maxValue=getMaximumValue(firstVariable,secondVariable,ThirdVariable);
        printMaxValue(maxValue);
        return maxValue;
    }

    //printing maximum value
    public void printMaxValue(T maxValue)
    {
        System.out.println(maxValue);
    }
}


