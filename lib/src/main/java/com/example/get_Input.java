package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by nishant on 29/9/17.
 */

public class get_Input {


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

}
