package com.example;

/**
 * Created by nishant on 29/9/17.
 */

public class Average {


    public static int Average (int...numbers)
    {
        int total =0;
        for(int x:numbers)
        {
            total+=x;
        }
        return total/numbers.length;
    }
}
