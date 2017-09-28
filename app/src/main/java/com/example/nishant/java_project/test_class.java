package com.example.nishant.java_project;

/**
 * Created by nishant on 7/26/17.
 */
public class test_class {

    public static void  main(String[] args)
    {
        System.out.println("Hello World");
        test2_class test2_class=new test2_class();
        test2_class.set_message();
        System.out.println(average(2,3,5,6));

    }

    public static int average (int...numbers)
    {
        int total =0;
        for(int x:numbers)
        {
            total+=x;
        }
        return total/numbers.length;
    }
}
