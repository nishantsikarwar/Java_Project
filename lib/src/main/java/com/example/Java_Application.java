package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.Scanner;


public class Java_Application {

    public static void main(String[] args) {

        try {
            URI uri=new URI("https://www.youtube.com");
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        int[] d;

        d=new int[]{1,2,3};

        String  user_string = getInput("");

     //   int average=  average(d);

        char [] ch = user_string.toCharArray();

    //    System.out.println("Hello_World"+user_string+average);

          user_string.trim();
          
        for(char c:ch){

            System.out.println(c);
        }

    }


    private static String getInput(String input_String){

        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        System.out.print(input_String);
        System.out.flush();

        try {
            return stdin.readLine();

        }catch (Exception expection){
            return "Error:"+expection.getMessage();
        }
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
