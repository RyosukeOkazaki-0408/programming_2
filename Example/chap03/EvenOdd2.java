// 読み込んだ整数値が正であれば偶数／奇数を判定して表示（その２）

import java.util.Scanner;

class EvenOdd2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値：");
		int n = stdIn.nextInt();

		if (n <= 0)
			System.out.println("正でない値が入力されました。");
		else
			if (n % 2 == 0)
				System.out.println("その値は偶数です。");
			else
				System.out.println("その値は奇数です。");
	}
}
