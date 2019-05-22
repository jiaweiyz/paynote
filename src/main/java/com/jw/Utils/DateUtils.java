package com.jw.Utils;

import java.util.Date;

public class DateUtils {
    public static void main(String[] args) {
        System.out.println(getNextDate());
    }

    public static Date getNextDate(){
        try{
            Thread.sleep(24*60*60*1000);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new Date();
    }
}