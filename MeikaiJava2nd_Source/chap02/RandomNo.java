// いろいろなパターンで乱数を生成して表示

import java.util.Random;
import java.util.Scanner;

class RandomNo {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		System.out.println("１桁の正の整数：" + ( 1 + rand.nextInt(9)));
		System.out.println("１桁の負の整数：" + (-1 - rand.nextInt(9)));
		System.out.println("２桁の正の整数：" + (10 + rand.nextInt(90)));

		System.out.print("整数n：");
		int n = stdIn.nextInt();	// nに整数値を読み込む
		System.out.println("n - 5 ～ n + 5：" + (n - 5 + rand.nextInt(11)));

		System.out.println(" 0.0以上 1.0未満" + (rand.nextDouble()));
		System.out.println(" 0.0以上10.0未満" + (10.0 * rand.nextDouble()));
		System.out.println("-1.0以上 1.0未満" + (-1 + 2 * rand.nextDouble()));
	}
}
 