package leetcodeTest;


import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Test {


    public static void main(String[] args) {




        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        arrayList.add("4");
        arrayList.add("5");
        List<String> temp = arrayList.subList(0, 3);
        System.out.println(Arrays.toString(temp.toArray()));

        System.out.println(Integer.valueOf("96463243")+"");




//        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>(16);
//        concurrentHashMap.put("12","123");
//        System.out.println(concurrentHashMap.get("12"));
//




//        System.out.println(secondToTime(60) + "");
//
//        String dateString = formatDateTime(60*1000);
//        System.out.println(dateString);
//        System.out.println(15%3+"");


    }

    public static String formatDateTime(long milliseconds) {
        StringBuilder sb = new StringBuilder();
        long mss = milliseconds / 1000;
        long days = mss / (60 * 60 * 24);
        long hours = (mss % (60 * 60 * 24)) / (60 * 60);
        long minutes = (mss % (60 * 60)) / 60;
        long seconds = mss % 60;
        DecimalFormat format = new DecimalFormat("00");
//        Log.d("Time", "--days:"+days+"--hours:"+hours+"--minutes:"+minutes+"--seconds:"+seconds);
        sb.append(format.format(hours)).append(":").append(format.format(minutes)).append(":").append(format.format(seconds));


//        Log.d("Time", "--data:"+sb.toString());
        return sb.toString();
    }

    private static String secondToDate(long second, String patten) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(second * 1000);//转换为毫秒
        Date date = calendar.getTime();
        SimpleDateFormat format = new SimpleDateFormat(patten, Locale.getDefault());
        String dateString = format.format(date);
        return dateString;
    }


    public final void say() {
        System.out.println("1234");
    }

    public static class User {

        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "name=" + name + "age=" + age;
        }
    }

    /**
     * 返回日时分秒
     *
     * @param second
     * @return
     */
    private static String secondToTime(long second) {
        long days = second / 86400;//转换天数
        second = second % 86400;//剩余秒数
        long hours = second / 3600;//转换小时数
        second = second % 3600;//剩余秒数
        long minutes = second / 60;//转换分钟
        second = second % 60;//剩余秒数
        if (0 < days) {
            return days + "天，" + hours + "小时，" + minutes + "分，" + second + "秒";
        } else {
            return hours + "小时，" + minutes + "分，" + second + "秒";
        }
    }
}




