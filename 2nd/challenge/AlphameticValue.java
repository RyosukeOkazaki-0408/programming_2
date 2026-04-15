// AlphameticValueクラスを書く

import java.util.Arrays;

public class AlphameticValue {
    private static StringBuilder sb = new StringBuilder();
    private static int[] vals = new int[10];
    private char[] digits;
    private static int cnt = 0;
    private static int freq = 1;
    
    public AlphameticValue(String s) {
        digits = s.toCharArray();
    }

    public static void dfs(AlphameticValue a, AlphameticValue b, AlphameticValue c) { 
        boolean[] used = new boolean[10]; 
        boolean[] checkMSD = new boolean[10]; 
        boolean[] assigned = new boolean[10];
        cnt = 0;

        //a,b,cのいずれかに使われている文字を確認
        for(char character : a.getDigits()) { used[character - 'A'] = true; }
        for(char character : b.getDigits()) { used[character - 'A'] = true; }
        for(char character : c.getDigits()) { used[character - 'A'] = true; }

        //a,b,cの最上位桁を確認
        checkMSD[a.getMSD()] = true;
        checkMSD[b.getMSD()] = true;
        checkMSD[c.getMSD()] = true;
        
        //再帰の本体
        dfs(a, b, c, used, checkMSD, assigned, 0); 
    }

    private static void dfs(AlphameticValue a, AlphameticValue b, AlphameticValue c, boolean[] used, boolean[] checkMSD, boolean[] assigned, int n) {

        //全ての対応関係ができたら探す
        if(n == vals.length) { 
            searchComb(a, b, c);
            return; 
        }

        //a,b,cのいずれにも使われていないアルファベットは回さない
        if(!used[n]) { 
            dfs(a, b, c, used, checkMSD, assigned, n+1);
            return; 
        }

        for(int i = 0; i < vals.length; i++) {
            //nonsenseかどうか確認
            if(checkMSD[n] && i == 0) { continue; }

            vals[n] = i;
            assigned[n] = true;

            //ありえない組み合わせかどうか判定
            if(checker(a, b, c, assigned)) { dfs(a, b, c, used, checkMSD, assigned, n+1); }

            //バックトラック処理
            assigned[n] = false;
        }
    }

    //a+b=cになるかを調べる
    private static void searchComb(AlphameticValue a, AlphameticValue b, AlphameticValue c) {

        int aInt = a.toInt();
        int bInt = b.toInt();
        int cInt = c.toInt();

        //もしa+b=cなら出力
        //freqで出力頻度を変更可能（現在は1）
        //解が多い場合は、freqを調整することでprintの頻度を落とすことができる
        if(aInt + bInt == cInt) {
            sb.append(String.format("%2d", ++cnt)).append("個目: ").append(Arrays.toString(vals))
            .append("\n").append(aInt).append(" + ").append(bInt).append(" = ").append(cInt).append("\n\n");
            if(cnt % freq == 0) {
                System.out.print(sb);
                sb = new StringBuilder();
            }
        }
    }

    //計算できるところから計算し、再帰回数を減らす
    private static boolean checker(AlphameticValue a, AlphameticValue b, AlphameticValue c, boolean[] assigned) {
        int carry = 0;
        int aLen = a.getLength();
        int bLen = b.getLength();
        int cLen = c.getLength();
        int mx = Math.max(aLen, Math.max(bLen, cLen));
        
        for(int i = 0; i < mx; i++) {
            int aIdx = aLen - 1 - i;
            int bIdx = bLen - 1 - i;
            int cIdx = cLen - 1 - i;

            //対応関係が決まっていなければ計算しない
            if(aIdx >= 0 && !assigned[a.getDigit(aIdx) - 'A']) { return true; }
            if(bIdx >= 0 && !assigned[b.getDigit(bIdx) - 'A']) { return true; }
            if(cIdx >= 0 && !assigned[c.getDigit(cIdx) - 'A']) { return true; }

            //桁数を越えていたら0扱いする
            int aTmp = (aIdx >= 0) ? a.toInt(aIdx) : 0;
            int bTmp = (bIdx >= 0) ? b.toInt(bIdx) : 0;
            int cTmp = (cIdx >= 0) ? c.toInt(cIdx) : 0;

            int sum = (aTmp + bTmp + carry) % 10;

            //枝刈り
            if(sum != cTmp) { return false; }

            //桁上げ
            carry = (aTmp + bTmp + carry) / 10;
        }
        return (carry == 0) ? true : false;
    }

    //与えられたstringを数値に直す
    private int toInt() {
        int tmp = 0;
        for(int i = 0; i < digits.length; i++) {
            char c = digits[i];
            tmp *= 10;
            tmp += vals[c - 'A'];
        }
        return tmp;
    }

    //与えられたstringのn文字目だけを数値に直す
    private int toInt(int n) { return vals[digits[n] - 'A']; }

    //セッタ
    public static void setVals(int[] vals) { AlphameticValue.vals = vals.clone(); }
    public void setDigits(char[] digits) { this.digits = digits.clone(); }
    public static void setFreq(int n) { freq = n; }

    //ゲッタ
    public static int[] getVals() { return vals.clone(); }
    public char[] getDigits() { return digits.clone(); }
    private char getDigit(int n) { return digits[n]; }
    private int getMSD() { return digits[0] - 'A'; }
    private int getLength() { return digits.length; }
    public static int getCnt() { return cnt; }
    public static StringBuilder getSb() { return sb; }
    public static int getFreq() { return freq; }
}