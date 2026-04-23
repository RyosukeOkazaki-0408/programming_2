import java.util.Scanner;
import java.util.Arrays;

public class Player {
    private static final Scanner sc = new Scanner(System.in);
    private static int turn = 0;
    private final String name;

    public Player(String name) { 
        this.name = name;
    }

    // ゲッタとセッタ
    public String getName() { return name; }
    public static void reset() { turn = 0; }

    // 勝敗が決まるとtrueを返す
    public boolean take(int[] mts) {
        int mt = 0, cnt = 0;
    
        // 現在の山の状況を表示
        printMts(mts);
        
        // 山と石の選択と例外処理
        System.out.println("\n" + this.name + "の番です。\n石を取る山を選択してください。(1以上" + mts.length + "以下の整数値)");
        while(true) {
            try { mt = sc.nextInt() - 1; }
            catch(Exception e) { 
                System.out.println("1以上" + mts.length + "以下の整数値を入力してください。");
                sc.nextLine();
                continue;
            }
            if(mt < 0 || mts.length <= mt) { System.out.println("1以上" + mts.length + "以下の整数値を入力してください。"); }
            else if(mts[mt] == 0) { System.out.println("選択した山には石が存在しません。"); }
            else break;
        }
        
        System.out.println("石を取る個数を選択してください。");
        while(true) {
            try { cnt = sc.nextInt(); }
            catch(Exception e) { 
                System.out.println("1以上の整数値を入力してください。"); 
                sc.nextLine();
                continue;
            }
            if(cnt <= 0) { System.out.println("1以上の整数値を入力してください。"); }
            else if(mts[mt] - cnt < 0) { System.out.println("選択した山には" + mts[mt] + "個しか石がありません。"); }
            else break;
        }
        System.out.println("----------------------------------------");
        
        // 山から石を取っている
        mts[mt] -= cnt;

        // 勝敗を判定
        return this.judge(mts);
    }

    // 全ての石が0であればtrueを返す
    protected boolean judge(int[] mts) {
        for(int a : mts) {
            if(a != 0) { return false; }
        }
        System.out.println("\n" + Arrays.toString(mts));
        System.out.println("\nおめでとうございます！" + this.name + "の勝利です！");
        System.out.println("----------------------------------------");
        return true;
    }

    // 現在の山の状況を表示
    protected void printMts(int[] mts) {
        System.out.println("\n" + Arrays.toString(mts) + " (" + ++turn +"手目の山)");
    }
}