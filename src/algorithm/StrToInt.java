package algorithm;

/**
 * 将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，但是string不符合数字要求时返回0)，
 * 要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0。
 */
public class StrToInt {

    public int StrToInt(String str) {

        if (str == null || str.length() <= 0) {
            return 0;
        }
        char[] chars = str.toCharArray();

        boolean isSpecial = false;
        for (int i = 0; i < chars.length; i++) {
            if (i == 0) {
                if (isSpecial(chars[i])) {
                    isSpecial = true;
                }
                if (!isSpecial(chars[i]) && !isDigit(chars[i])) {

                    return 0;
                }
                continue;

            }
            if (!isDigit(chars[i])) {
                return 0;
            }

        }

        int sum = 0;
        for (int i = 0; i < chars.length; i++) {
            sum += (chars[i] - '0') * Math.pow(10, chars.length - i);


        }

        return sum;


    }

    public boolean isDigit(char index) {
        if ('0' <= index && index <= '9')
            return true;
        return false;
    }

    public boolean isSpecial(char index) {
        if ('+' == index || index == '-')
            return true;
        return false;
    }

    public static void main(String[] args) {

        StrToInt entity = new StrToInt();
        System.out.println(entity.StrToInt("123456") + "");


    }
}
