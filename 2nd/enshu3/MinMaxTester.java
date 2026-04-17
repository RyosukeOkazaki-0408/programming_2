// mainメソッドを含むMinMaxTesterクラスを書く

import java.util.Arrays;

public class MinMaxTester {
    public static void main(String[] args) {
        int a = -1;
        int b = 2;
        int c = 5;
        int[] nums = {a, b, c};

        //a,b,c,numsの要素を表示
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("nums = " + Arrays.toString(nums));

        System.out.println();

        //出力結果を表示
        System.out.println("max(a, b) = " + MinMax.max(a, b));
        System.out.println("min(a, b) = " + MinMax.min(a, b));
        System.out.println("max(a, b, c) = " + MinMax.max(a, b, c));
        System.out.println("min(a, b, c) = " + MinMax.min(a, b, c));
        System.out.println("max(nums) = " + MinMax.max(nums));
        System.out.println("min(nums) = " + MinMax.min(nums));
    }
}