package leetcode;

/**
 * 415. 字符串相加
 * 这是正确答案
 */
public class AddStrings {


    public String addStrings(String num1, String num2) {
        if (num1 == null || num1.length() == 0) {
            return num2;
        }

        if (num2 == null || num2.length() == 0) {
            return num1;
        }
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int add = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (i >= 0 || j >= 0 || add != 0) {

            int x1 = i >= 0 ? num1.charAt(i)-'0' : 0;
            int x2 = j >= 0 ? num2.charAt(j)-'0' : 0;
            stringBuilder.append((x1 + x2 + add) % 10);
            add = (x1 + x2 + add) / 10;
            j--;
            i--;


        }
        stringBuilder.reverse();
        return stringBuilder.toString();


    }


}
