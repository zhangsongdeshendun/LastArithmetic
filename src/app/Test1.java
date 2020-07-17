package app;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Test1 extends Test {


    public static void main(String[] args) {

//        String x1 = getDayTime(1575133397);
//        String x2 = getDayTime(1575234197);
//
//
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//
//        try {
//            Date date2 = format.parse(x1);
//            Date date = format.parse(x2);
//
//            System.out.println("两个日期的差距：" + differentDays(date, date2));
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }


        System.out.println("两个日期的差距：" + Math.abs(differentDays(1575723797, 1575723780)));

    }


    public static int differentDays(long timeStamp1, long timeStamp2) {

        String x1 = getDayTime(timeStamp1);
        String x2 = getDayTime(timeStamp2);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date date1 = null;
        Date date2 = null;

        try {
            date1 = format.parse(x1);
            date2 = format.parse(x2);

        } catch (ParseException e) {
            e.printStackTrace();
        }


        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);

        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);
        int day1 = cal1.get(Calendar.DAY_OF_YEAR);
        int day2 = cal2.get(Calendar.DAY_OF_YEAR);

        int year1 = cal1.get(Calendar.YEAR);
        int year2 = cal2.get(Calendar.YEAR);
        if (year1 != year2)   //同一年
        {
            int timeDistance = 0;
            for (int i = year1; i < year2; i++) {
                if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)    //闰年
                {
                    timeDistance += 366;
                } else    //不是闰年
                {
                    timeDistance += 365;
                }
            }

            return timeDistance + (day2 - day1);
        } else    //不同年
        {
            return day2 - day1;
        }
    }

    private static String getDayTime(long timeStamp) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeStamp);
        timeStamp = calendar.getTimeInMillis(); //转换成当前时区下的时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        return sdf.format(timeStamp * 1000);
    }


}
