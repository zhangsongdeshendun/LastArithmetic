package app;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Test1 extends Test {


    public static void main(String[] args) {
//        String date = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new java.util.Date(Unix timestamp * 1000))
        System.out.println(System.currentTimeMillis()/1000+"");
        String x="CN,北京,北京市";
        String[] strArr = x.split(",");
        System.out.println(strArr[strArr.length-1]);
//
//        ArrayList<String> array = new ArrayList<>();
//        array.add("3");
//        array.add("30");
//        array.add("34");
//        array.add("5");
//        array.add("9");
//
//
//        Collections.sort(array, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                String x1 = o1 + o2;
//                String x2 = o2 + o1;
//                if (Long.valueOf(x1) > Long.valueOf(x2)) {
//                    return -1;
//                } else {
//                    return 1;
//                }
//            }
//        });

//
//        for (String str : array) {
//            System.out.println(str);
//        }


    }


}
