package com.example;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;


public class Java_Application {

    public static void main(String[] args) {

     int looping =5;

        Threading threading=new Threading();
        threading.start();

        My_Runnable my_runnable=new My_Runnable();

        new Thread(my_runnable).start();

        try {
            for (int i=0;i<looping;++i){
                System.out.println("Form_Main_Process");
                Thread.sleep(3000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }










    /* try {


         URL url = new URL("http://php.net/manual/en/tutorial.firstpage.php");
         InputStream inputStream = url.openStream();
         BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

         StringBuilder stringBuilder = new StringBuilder();
         while (true) {
             int data = bufferedInputStream.read();
             if (data == -1) {
                 break;

             } else {
                 stringBuilder.append((char) data);
             }
         }

         System.out.println(stringBuilder);

     }catch (MalformedURLException e){
         e.printStackTrace();
     }catch (IOException e){
         e.printStackTrace();
     }

*/
    /*    try {
            URI uri=new URI("https://www.youtube.com");
        } catch (URISyntaxException e) {
            e.printStackTrace();

            System.out.println(e.getMessage());
        }*/
 /*    try {


         File file = new File("/home/nishant/Documents/Java.txt/");

         File file1 = new File("/home/nishant/Documents/Target.txt/");

         InputStream inputStream = new FileInputStream(file);

         OutputStream outputStream = new FileOutputStream(file1);

         byte[] buffer = new byte[1024];
         int len;
         while ((len = inputStream.read(buffer)) > 0) {
             outputStream.write(buffer, 0, len);
         }

         inputStream.close();
         outputStream.close();

         System.out.println("opened_Sucess");

     } catch (FileNotFoundException e){
         e.printStackTrace();

     }catch (IOException e){
         e.printStackTrace();
     }
*/

        /* HashMap<Integer, Integer> hashMap= new HashMap<>();

        hashMap.put(0,1);
        hashMap.put(1,2);

        System.out.println(hashMap);

        Set<Integer> keys=hashMap.keySet();

        Iterator<Integer> iterator = keys.iterator();

        while(iterator.hasNext()){
            Integer value=iterator.next();
            System.out.print(value+hashMap.get(value));
        }
*/

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




}
