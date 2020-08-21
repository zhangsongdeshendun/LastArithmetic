package swordOffer;

/**
 * 这是正确答案
 * 剑指 Offer 66. 构建乘积数组
 *
 */
public class ConstructArr {
    public int[] constructArr(int[] a) {
        if (a == null || a.length == 0) {
            return new int[0];
        }
        int n = a.length;
        int[] b = new int[n];
        for (int i = 0, product = 1; i < n; i++) { /* 从左往右累乘 */
            b[i] = product;
            product *= a[i];
        }
        for (int i = n - 1, product = 1; i >= 0; i--) {/* 从右往左累乘 */
            b[i] *= product;
            product *= a[i];
        }
        return b;


    }

    public static void main(String[] args){
        ConstructArr constructArr=new ConstructArr();
        int[] arra={1,2,3,4,5};
        constructArr.constructArr(arra);
    }

}
