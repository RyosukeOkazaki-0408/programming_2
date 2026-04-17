// 点数を読み込んで最低点を表示

import java.util.Scanner;

class LoScore {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		final int NUMBER = 5;						// 人数
		int[] tensu = new int[NUMBER];	// 点数

		System.out.println(NUMBER + "人の点数を入力せよ。");
		for (int i = 0; i < NUMBER; i++) {
			System.out.print((i + 1) + "番の点数：");
			tensu[i] = stdIn.nextInt();		// tensu[i]を読み込む
		}

		int min = tensu[0];
		for (int i = 1; i < tensu.length; i++)
			if (tensu[i] < min) min = tensu[i];

		System.out.println("最低点は" + min + "点です。");
	}
}
