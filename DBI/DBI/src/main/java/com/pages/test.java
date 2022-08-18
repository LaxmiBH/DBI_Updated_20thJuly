package com.pages;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class test {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat formatter = new SimpleDateFormat("hh mm");
        String formatteddate = formatter.format(date);
        System.out.println(formatteddate);

        System.out.println(formatteddate.charAt(1));


        /*Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(day);

        Calendar calendar1 = Calendar.getInstance();
        Date date1 = calendar.getTime();
        System.out.println(new SimpleDateFormat("EE", Locale.ENGLISH).format(date.getTime()));
        System.out.println(new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date.getTime()));*/
    }
}
