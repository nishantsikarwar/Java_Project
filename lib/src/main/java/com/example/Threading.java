package com.example;

/**
 * Created by nishant on 7/10/17.
 */

public class Threading extends Thread {


    @Override
    public void run() {

    //    synchronized ()

     try{

         sleep(1000);

     }catch (InterruptedException e){
         e.printStackTrace();
     }


       /* int looping=7;

        try {
            for (int i=0;i<looping;++i){
                System.out.println("From_Secondary_Thread");
                sleep(2000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }*/
    }
}
