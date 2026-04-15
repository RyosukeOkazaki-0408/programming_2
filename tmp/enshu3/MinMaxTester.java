// mainメソッドを含むMinMaxTesterクラスを書く

public class MinMaxTester {
    public static void main(String[] args) {
        int[] a = {1,3,7,5};

        System.out.println(MinMax.min(1,2));
        System.out.println(MinMax.max(1,2));
        System.out.println(MinMax.min(1,3,2));
        System.out.println(MinMax.max(1,3,2));
        System.out.println(MinMax.min(a));
        System.out.println(MinMax.max(a));
    }
}