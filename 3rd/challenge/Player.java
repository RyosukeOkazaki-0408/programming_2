import java.util.Scanner;
import java.util.Arrays;

public class Player {
    private static final Scanner sc = new Scanner(System.in);
    private String name = "";

    public Player(String name) { 
        this.name = name;
    }

    public String getName() { return name; }

    public boolean take(int[] mts) {
        int mt = 0, cnt = 0;
    
        printMts(mts);
        
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
            else if(mts[mt] - cnt < 0) { System.out.println("選択した山には" + cnt + "個の石がありません。"); }
            else break;
        }
        
        mts[mt] -= cnt;

        return this.judge(mts);
    }

    protected boolean judge(int[] mts) {
        for(int a : mts) {
            if(a != 0) { return false; }
        }
        System.out.println("----------------------------------------");
        System.out.println(this.name + "の勝利です。");
        System.out.println("----------------------------------------");
        return true;
    }

    protected void printMts(int[] mts) {
        System.out.println("----------------------------------------");
        System.out.println("\n" + Arrays.toString(mts) + " (現在の山)");
    }
}