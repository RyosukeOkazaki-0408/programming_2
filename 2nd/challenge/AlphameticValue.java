// AlphameticValueクラスを書く
// AlphameticValueクラスを書く
import java.util.Arrays;

public class AlphameticValue {
    private static StringBuilder sb = new StringBuilder();
    private static int[] vals = new int[10];
    private char[] digits;
    private static int cnt = 0;
    
    
    public AlphameticValue(String s) {
        digits = s.toCharArray();
    }

    public static void dfs(AlphameticValue a, AlphameticValue b, AlphameticValue c) { 
        boolean[] used = new boolean[10];
        boolean[] checkMSD = new boolean[10];
        boolean[] assigned = new boolean[10];
        cnt = 0;

        for(char character : a.getDigits()) { used[character - 'A'] = true; }
        for(char character : b.getDigits()) { used[character - 'A'] = true; }
        for(char character : c.getDigits()) { used[character - 'A'] = true; }
        checkMSD[a.getMSD()] = true;
        checkMSD[b.getMSD()] = true;
        checkMSD[c.getMSD()] = true;
        
        dfs(a, b, c, used, checkMSD, assigned, 0); 
    }

    private static void dfs(AlphameticValue a, AlphameticValue b, AlphameticValue c, boolean[] used, boolean[] checkMSD, boolean[] assigned, int n) {

        if(n == vals.length) { 
            searchComb(a, b, c);
            return; 
        }
        if(!used[n]) { 
            dfs(a, b, c, used, checkMSD, assigned, n+1);
            return; 
        }

        for(int i = 0; i < vals.length; i++) {
            if(checkMSD[n] && i == 0) { continue; }
            vals[n] = i;
            assigned[n] = true;
            if(checker(a, b, c, assigned)) { dfs(a, b, c, used, checkMSD, assigned, n+1); }
            assigned[n] = false;
        }
    }

    private static void searchComb(AlphameticValue a, AlphameticValue b, AlphameticValue c) {

        int aInt = a.toInt();
        int bInt = b.toInt();
        int cInt = c.toInt();

        if(aInt + bInt == cInt) {
            sb.append(++cnt).append("個目: ").append(Arrays.toString(vals))
            .append("\n").append(aInt).append(" + ").append(bInt).append(" = ").append(cInt).append("\n");
            if(cnt % 1 == 0) {
                System.out.print(sb);
                sb = new StringBuilder();
            }
        }
    }

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

            if(aIdx >= 0 && !assigned[a.getDigit(aIdx) - 'A']) { return true; }
            if(bIdx >= 0 && !assigned[b.getDigit(bIdx) - 'A']) { return true; }
            if(cIdx >= 0 && !assigned[c.getDigit(cIdx) - 'A']) { return true; }

            int aTmp = (aIdx >= 0) ? a.toInt(aIdx) : 0;
            int bTmp = (bIdx >= 0) ? b.toInt(bIdx) : 0;
            int cTmp = (cIdx >= 0) ? c.toInt(cIdx) : 0;

            int sum = (aTmp + bTmp + carry) % 10;

            if(sum != cTmp) { return false; }

            carry = (aTmp + bTmp + carry) / 10;
        }
        return (carry == 0) ? true : false;
    }

    private int toInt() {
        int tmp = 0;
        for(int i = 0; i < digits.length; i++) {
            char c = digits[i];
            tmp *= 10;
            tmp += vals[c - 'A'];
        }
        return tmp;
    }

    private int toInt(int n) { return vals[digits[n] - 'A']; }

    private static void setVals(int[] vals) { AlphameticValue.vals = vals.clone(); }
    private void setDigits(char[] digits) { this.digits = digits.clone(); }

    private static int[] getVals() { return vals.clone(); }
    private char[] getDigits() { return digits.clone(); }
    private char getDigit(int n) { return digits[n]; }
    private int getMSD() { return digits[0] - 'A'; }
    private int getLength() { return digits.length; }
    public static int getCnt() { return cnt; }
    public static StringBuilder getSb() { return sb; }

    @Override
    public String toString() {
        return new String(digits);
    }
}