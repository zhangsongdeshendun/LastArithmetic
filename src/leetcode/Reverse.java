package leetcode;

/**
 * 7. 整数反转
 * 这个不是正确答案 ，会超出整数范围
 */
public class Reverse {

    public int reverse(int x) {
        char[] chars = String.valueOf(x).toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        if (x < 0) {
            for (int i = chars.length - 1; i > 0; i--) {
                stringBuilder.append(chars[i]);
            }
            String target = stringBuilder.toString();
            if (target.indexOf(0) == '0') {
                String result = target.substring(1, target.length());

                return -Integer.valueOf(result);
            }
            return -Integer.valueOf(stringBuilder.toString());

        } else {
            for (int i = chars.length - 1; i >= 0; i--) {
                stringBuilder.append(chars[i]);
            }
            String target = stringBuilder.toString();
            if (target.indexOf(0) == '0') {
                String result = target.substring(1, target.length());
                return Integer.valueOf(result);
            }
            return Integer.valueOf(target);
        }

    }

    public static void main(String[] args){

        Reverse reverse=new Reverse();
        System.out.println(reverse.reverse(1534236469)+"");

    }
}
