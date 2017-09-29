package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;


public class Java_Application {

    public static void main(String[] args) {

        try {
            URI uri=new URI("https://www.youtube.com");
        } catch (URISyntaxException e) {
            e.printStackTrace();

            System.out.println(e.getMessage());
        }

        HashMap<Integer, Integer> hashMap= new HashMap<>();

        hashMap.put(0,1);
        hashMap.put(1,2);

        System.out.println(hashMap);

        Set<Integer> keys=hashMap.keySet();

        Iterator<Integer> iterator = keys.iterator();

        while(iterator.hasNext()){
            Integer value=iterator.next();
            System.out.print(value+hashMap.get(value));
        }


     //   int average=  average(d);

  /*      char [] ch = user_string.toCharArray();
                       int[] d;

          d=new int[]{1,2,3};
    //    System.out.println("Hello_World"+user_string+average);

          user_string.trim();

          
        for(char c:ch){

            System.out.println(c);
        }

          ArrayList<String>arrayList=new ArrayList<String>();



        String  user_string = getInput("");


          while(user_string.length()!=0)
            arrayList.add(user_string);

        System.out.println(arrayList);


        */

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
