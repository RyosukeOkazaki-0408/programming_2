// ユーティリティクラスMinMaxを書く
import java.util.Arrays;

public class MinMax {

    public static int max(int a, int b) { return Math.max(a, b); }
    public static int max(int a, int b, int c) { return Math.max(c, max(a, b)); }
    public static int max(int[] a) {
        Arrays.sort(a);
        return a[a.length-1];
    }

    public static int min(int a, int b) { return Math.min(a, b); }
    public static int min(int a, int b, int c) { return Math.min(c, min(a, b)); }
    public static int min(int[] a) {
        Arrays.sort(a);
        return a[0];
    }
}