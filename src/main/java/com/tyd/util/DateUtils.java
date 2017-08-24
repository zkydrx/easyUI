package com.tyd.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by ZKY on 2017-08-24 14:21.
 */
public class DateUtils
{
    /**
     * 将字符串日期转为Date
     * @param strDate
     * @return
     * @throws ParseException
     */
    public static Date changeDate(String strDate) throws ParseException
    {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        /**
         JAVA 8
         String string = "January 2, 2010";
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
         LocalDate date = LocalDate.parse(string, formatter);
         System.out.println(date); // 2010-01-02
         */
//        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
//        LocalDate date = LocalDate.parse(strDate,formatter);
//        System.out.println(date);
//        return date;

        /**
         In your specific case of "January 2, 2010" as input string, "January" is the full text month, so use MMMM pattern for it, "2" is the short day-of-month, so use d pattern for it, "2010" is the 4-digit year, so use yyyy pattern for it.

         String string = "January 2, 2010";
         DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
         Date date = format.parse(string);
         System.out.println(date); // Sat Jan 02 00:00:00 GMT 2010
         Note the importance of explicit Locale argument.
         If you omit it, then it will use the default locale which is not necessarily English as used in the month name of the input string.
         If the locale doesn't match with the input string, then you would confusingly get a java.text.ParseException even though when the format pattern seems valid.
         */
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.SIMPLIFIED_CHINESE);
        Date date =  format.parse(strDate);
        return date;
    }


    /**
     * 将日期转为String 字符串。
     * @param date
     * @return
     */
     public static String formatDate(Date date)
     {
         SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
         String strDate = dateFormat.format(date);
         return strDate;
     }
}
