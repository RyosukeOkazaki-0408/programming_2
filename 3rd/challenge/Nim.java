import java.util.Scanner;
import java.util.Random;

public class Nim {
    private static int[] mts;
    private static Player P1;
    private static Player P2;
    private static int type = 0;
    private static final Random rand = new Random();
    public static void main(String[] args) {

        //trueの方が課題確認が楽だと思います%
        final boolean testMode = true;
        //falseは遊ぶ時用

        if(testMode) {

            set(4, 15); // 4山くずし（石15個）
            start();

            set(3, 10, "user1"); // 3山くずし（石10個）
            start();

            set(2, 7, "user1", "user2"); // 2山くずし（石7個）
            start();
        } else {
            final Scanner sc = new Scanner(System.in);
            int cnt = 0;

            // 初期条件の設定と例外処理
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

            System.out.println("遊ぶ山の高さ(おおよその平均)を選択してください。");
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

            // 山に石を乗せる
            for(int i = 0; i < mts.length; i++) {
                mts[i] = Math.max(1, cnt + rand.nextInt(cnt/2) - cnt/4);
            }

            // typeに応じてPlayerかComputerかを選ぶ
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

            // ゲーム開始
            start();
        }
    }
    
    private static void start() {
        System.out.println("----------------------------------------");
        System.out.println("ゲームを開始します。");
        System.out.println("----------------------------------------");

        // 勝敗が決まるまで交互に石を取る
        // 勝敗が決まるとbreakされる
        if(type != 1 || mts.length % 2 != 0) {
            while (true) {
                if(P1.take(mts)) { break; }
                if(P2.take(mts)) { break; }
            }
        } else {
            while (true) {
                if(P2.take(mts)) { break; }
                if(P1.take(mts)) { break; }
            }
        }
    }

    // testMode == trueの際の設定
    private static void set(int size, int cnt) { 
        type = 2;
        mts = new int[size];
        for(int i = 0; i < mts.length; i++) {
            mts[i] = Math.max(1, cnt + rand.nextInt(cnt/2) - cnt/4);
        }
        reset();
        P1 = new Computer();
        P2 = new Computer();
    }
    
    private static void set(int size, int cnt, String name) {
        type = 1;
        mts = new int[size];
        for(int i = 0; i < mts.length; i++) {
            mts[i] = Math.max(1, cnt + rand.nextInt(cnt/2) - cnt/4);
        }
        reset();
        P1 = new Player(name);
        P2 = new Computer();
    }

    private static void set(int size, int cnt, String name1, String name2) {
        type = 0;
        mts = new int[size];
        for(int i = 0; i < mts.length; i++) {
            mts[i] = Math.max(1, cnt + rand.nextInt(cnt/2) - cnt/4);
        }
        reset();
        P1 = new Player(name1);
        P2 = new Player(name2);
    }

    private static void reset() {
        Player.reset();
        Computer.reset();
    }
}