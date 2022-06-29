package com.xfleet.utilities;

public class BrowserUtils {


   // static sleep method accept seconds and wait during time
   //@param seconds
    public static void sleep(int seconds) {

        int wait =seconds*1000;
        try {
            Thread.sleep(wait);
        } catch (InterruptedException e) {
            System.out.println("static sleep issue");
        }
    }




}
