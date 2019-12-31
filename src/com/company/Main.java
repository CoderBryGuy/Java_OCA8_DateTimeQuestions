package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        //System.out.println(new LocalDate(2012, 5, 21));
        //System.out.println(new LocalDate(2012, 6, 21));
//        System.out.println(LocalDate.of(2012, 5, 21));
//        System.out.println(LocalDate.of(2012, 6, 21));
//        System.out.println(LocalDate.of(2012, Calendar.JUNE, 21));
//        System.out.println(LocalDate.of(2012, Month.JUNE, 21));

//        LocalDate date = LocalDate.parse("2020-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
//        date.plusDays(3);
//       // date.plusHours(); // error no hours in localdate
//        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
//        LocalDate date = LocalDate.of(2020, Month.APRIL, 30);
//        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
//
//        LocalDate date = LocalDate.of(2028, Month.APRIL, 30);
//        date.plusDays(2);
//        date.plusYears(3);
//        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());


//        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
//        Period p = Period.of(1,2,3);
//        d = d.minus(p);
//        DateTimeFormatter f = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
//        System.out.println(d.format(f));

        LocalDateTime d = LocalDateTime.of(2017, 5, 10, 11, 22, 33);
        Period p = Period.ofDays(1).ofYears(2);
        d = d.minus(p);
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(f.format(d));

        
    }
}
