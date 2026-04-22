// 配列の全要素に乱数を代入して縦向きの棒グラフで表示

import java.util.Random;
import java.util.Scanner;

class IntArrayRand2 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		System.out.print("要素数：");
		int n = stdIn.nextInt();				// 要素数を読み込む
		int[] a = new int[n];						// 配列を生成

		for (int i = 0; i < n; i++)
			a[i] = 1 + rand.nextInt(10);	// 1～10の乱数

		for (int i = 10; i >= 1; i--) {
			for (int j = 0; j < n; j++)
				if (a[j] >= i) 
					System.out.print("* ");
				else
					System.out.print("  ");
			System.out.println();
		}

		for (int i = 0; i < 2 * n; i++)
			System.out.print('-');
		System.out.println();

		for (int i = 0; i < n; i++)
			System.out.print(i % 10 + " ");
		System.out.println();
	}
}
