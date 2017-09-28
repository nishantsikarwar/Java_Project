package com.example;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by nishant on 28/9/17.
 */

public class Java_Application {

    public static void main(String[] args) {

        char [] ch ={'H','E','L','L','O','!'};

        String s=new String(ch);

        double d= 123.9087;

        String string = Double.toString(d);

        BigDecimal payment=new BigDecimal(string);

        Double decimal =new Double(d);

        int interger  =  decimal.intValue();

        Date date= new Date();

        System.out.println(++interger+123+"Hello_World"+s+payment+"!!!!!!"+date);

    }
}
