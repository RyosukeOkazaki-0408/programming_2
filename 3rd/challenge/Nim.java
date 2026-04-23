import java.util.Scanner;
import java.util.Arrays;

public class Nim {
    private static int[] mts;
    private static Player P1;
    private static Player P2;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0, type = 0;

        System.out.println("何山くずしをプレイしますか？(1以上の整数値で入力)");
        while(true) {
            try { mts = new int[sc.nextInt()]; }
            catch(Exception e) { 
                System.out.println("1以上の整数値を入力してください。"); 
                sc.nextLine();
                continue;
            }
            if(mts.length <= 0) { System.out.println("1以上の整数値を入力してください。"); }
            else break;
        }

        System.out.println("\nモードを選択してください。\n0: 2人で対戦\n1: CPUと対戦\n2: CPU同士の対戦を見る");
        while(true) {
            try { type = sc.nextInt(); }
            catch(Exception e) { 
                System.out.println("0,1,2のいずれかを入力してください。"); 
                sc.nextLine();
                continue;
            }
            if(type < 0 || 2 < type) { System.out.println("0,1,2のいずれかを入力してください。"); }
            else break;
        }

        System.out.println("遊ぶ山の高さを選択してください。");
        while(true) {
            try { cnt = sc.nextInt(); }
            catch(Exception e) { 
                System.out.println("1以上の整数値を入力してください。"); 
                sc.nextLine();
                continue;
            }
            if(cnt <= 0) { System.out.println("1以上の整数値を入力してください。"); }
            else break;
        }

        Arrays.fill(mts, cnt);

        if(type == 0) {
            System.out.println("P1の名前を選択してください。");
            P1 = new Player(sc.next());
            System.out.println("P2の名前を選択してください。");
            P2 = new Player(sc.next());
        } else if(type == 1) {
            System.out.println("あなたの名前を選択してください。");
            P1 = new Player(sc.next());
            P2 = new Computer();
        } else {
            P1 = new Computer();
            P2 = new Computer();
        }

        System.out.println("----------------------------------------");
        System.out.println("ゲームを開始します。");

        while (true) {
            if(P1.take(mts)) { break; }
            if(P2.take(mts)) { break; }
        }
    }
}