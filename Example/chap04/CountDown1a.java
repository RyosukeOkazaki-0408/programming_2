// 正の整数値を０までカウントダウン（その１[改]ループ終了後のxの値を表示）

import java.util.Scanner;

class CountDown1a {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("カウントダウンします。");
		int x;
		do {
			System.out.print("正の整数値：");
			x = stdIn.nextInt();
		} while (x <= 0);

		while (x >= 0) {
			System.out.println(x);	// xの値を表示
			x--;										// xの値をデクリメント（値を１減らす）
		}
		System.out.println(x);		// xの値を表示
	}
}
