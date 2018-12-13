package com.leap.qa.utils.DataGenerator.utils;

import org.apache.commons.lang3.RandomUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by qingshuang on 2018/12/13
 */
public class TimeUtils {

    public static Date getNow(){
        Date date = new Date();
        return date;
    }

    public static String dateFormat1(Date date){
        SimpleDateFormat ymd1 = new SimpleDateFormat("yyyy-MM-dd");
        String dateStr1 = ymd1.format(date);
        return dateStr1;
    }

    public static String dateFormat2(Date date){
        SimpleDateFormat ymd2 = new SimpleDateFormat("yyyyMMdd");
        String dateStr2 = ymd2.format(date);
        return dateStr2;
    }

    public static String dateFormat3(Date date){
        SimpleDateFormat ymd3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr3 = ymd3.format(date);
        return dateStr3;
    }

    public static long getTimestampByDate(String dateString) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = simpleDateFormat.parse(dateString);
            return date.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static Date getSpecificYeasGapDate(Date date, int n){
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.YEAR, n);
        return  cal.getTime();
    }

    public static Date randomDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1970, 1, 1);
        long earlierDate = calendar.getTime().getTime();
        calendar.set(2000, 1, 1);
        long laterDate = calendar.getTime().getTime();
        long chosenDate = RandomUtils.nextLong(earlierDate, laterDate);
        return new Date(chosenDate);
    }
}
