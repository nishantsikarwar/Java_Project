package com.example;

/**
 * Created by nishant on 7/10/17.
 */

public class My_Runnable implements Runnable {

    @Override
    public void run(){
        int looping=9;

        try {
            for (int i=0;i<looping;++i){
                System.out.println("From_Runnable_Method");
                Thread.sleep(2000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
