package com.company;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Pattern pattern1=Pattern.compile("[x-z]+");
        Matcher matcher1=pattern1.matcher("x y z 1 2 3 4 ");
        System.out.println(matcher1.find());

        System.out.println("Current locale: " + Locale.getDefault());
        Date date=new Date();
        Calendar calendar=new GregorianCalendar();
        calendar.set(1999,10,3,9,55);
        date=calendar.getTime();
        System.out.println("Calendar: "+calendar.getTime());
        System.out.println("Date: "+date);
    }
}
