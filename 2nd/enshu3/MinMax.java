// ユーティリティクラスMinMaxを書く

import java.util.Arrays;

public class MinMax {

    public static int max(int a, int b) { return Math.max(a, b); }
    public static int min(int a, int b) { return Math.min(a, b); }

    public static int max(int a, int b, int c) { return max(a, max(b, c)); }
    public static int min(int a, int b, int c) { return min(a, min(b, c)); }

    public static int max(int[] a) { 
        int mx = Integer.MIN_VALUE;
        for(int i = 0; i < a.length; i++) {
            mx = (mx < a[i]) ? a[i] : mx;
        }
        return mx;
    }
    public static int min(int[] a) {
        int mn = Integer.MAX_VALUE;
        for(int i = 0; i < a.length; i++) {
            mn = (mn > a[i]) ? a[i] : mn;
        }
        return mn;
    }
}