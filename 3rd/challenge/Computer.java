import java.util.Random;

public class Computer extends Player {
    private static int id = 0;
    private final Random rand = new Random();
    private static final interval = 500;

    public Computer() { super("CPU" + ++id); }

    @Override
    public boolean take(int[] mts) {
        int mt = 0, cnt = 0;

        try {
            Thread.sleep(interval);
        } catch(InterruptedException e){}  

        printMts(mts);

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

        return judge(mts);
    }

    private static int nimSum(int[] mts) {
        int sum = 0;
        for(int a : mts) sum ^= a;
        return sum;
    }
}
