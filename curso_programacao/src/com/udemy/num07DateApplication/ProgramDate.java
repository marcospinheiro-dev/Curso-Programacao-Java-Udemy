package com.udemy.num07DateApplication;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;


public class ProgramDate {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println(d);
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4);
        d = cal.getTime();
        //System.out.println(sdf.format(d));
        System.out.println(d);
        int minutes = cal.get(Calendar.MINUTE);
        System.out.println("Minutes: " + minutes);
        int month = cal.get(Calendar.MONTH);
        System.out.println("Month: " + month);
    }

}
