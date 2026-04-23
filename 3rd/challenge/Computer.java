import java.util.Random;

public class Computer extends Player {
    private static int id = 0;
    private final Random rand = new Random();
    private static final int interval = 500;

    public Computer() { super("CPU" + ++id); }

    // testMode == true時の初期化メソッド
    public static void reset() { id = 0; }

    @Override
    public boolean take(int[] mts) {
        int mt = 0, cnt = 0;

        // 視認性向上のためのinterval処理
        try {
            Thread.sleep(interval);
        } catch(InterruptedException e){}  

        // 現在の山の状況を表示
        printMts(mts);

        // ニム和が0でない場合に、ニム和が0になるように動く
        if(nimSum(mts) != 0) {
            boolean changed = false;
            int[] tmp = mts.clone();
            
            for(int i = 0; i < mts.length; i++) {
                for(int j = mts[i]; j >= 1; j--) {
                    tmp[i] -= j;
                    if(nimSum(tmp) == 0) {
                        mt = i;
                        cnt = j;
                        mts[mt] -= cnt;
                        changed = true;
                        break;
                    } else { tmp[i] = mts[i]; }
                }
                if(changed) { break; }
            }
        // ニム和が0（最善手がない）場合、ランダムな山からランダムに石を取る
        } else {
            mt = rand.nextInt(mts.length);
            while(mts[mt] == 0) {
                mt++;
                mt %= mts.length;
            }

            cnt = rand.nextInt(mts[mt]) + 1;
            mts[mt] -= cnt;
        }
        
        System.out.println("\n" + getName() + "は山" + ++mt + "から、石を" + cnt + "個取ります。");
        System.out.println("----------------------------------------");

        // 勝敗の判定
        return judge(mts);
    }

    // ニム和（排他的論理和）を計算している
    private static int nimSum(int[] mts) {
        int sum = 0;
        for(int a : mts) sum ^= a;
        return sum;
    }
}
