// VariableBaseValueクラスを書く

public class BinHexVariableBaseValue {
    private static int base = 10;
    private int value;

    //コンストラクタ
    public BinHexVariableBaseValue(int v) {
        value = v;
    }
    
    //base, valueのセッタ
    public static void setBase(int b) {
        if(b < 2) { base = 2; }
        else if(10 < b) { base = 10; }
        else base = b;
    }
    public void setValue(int v) {
        value = v;
    }

    //base, valueのゲッタ
    public static int getBase() { return base; }
    public int getValue() { return value; }

    //valueの値を受け取り、その値をbaseで割ったあまりを考えることで、下位の桁から順に数字を埋めている
    @Override
    public String toString() {
        int v = value;
        String s = "";
        do{
            s = (v % base) + s;
            v /= base;
        } while(v > 0);
        return value + "を" + base + "進数で表すと、" + s + "です。";
    }
}