package algorithm;

/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 */
public class Fibonacci {

    public int fibonacci(int n) {

        if (n == 0 || n == 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);

    }


    public static void main(String[] args) {

        Fibonacci entity=new Fibonacci();
        System.out.println(entity.fibonacci(6));

    }
}
