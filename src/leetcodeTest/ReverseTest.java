package leetcodeTest;

public class ReverseTest {

    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int t = x % 10;
            int newReult = result * 10 + t;
            if ((newReult - t) / 10 != result) {
                return 0;
            }
            result = newReult;
            x = x / 10;
        }
        return result;

    }
    public static void main(String[] args){
        ReverseTest reverseTest=new ReverseTest();
        reverseTest.reverse(123);
    }


}
