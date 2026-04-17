// 読み込んだ整数値はゼロであるかどうか（==演算子）

import java.util.Scanner;

class Zero2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値：");
		int n = stdIn.nextInt();

		if (n == 0)
			System.out.println("その値はゼロです。");
		else
			System.out.println("その値はゼロではありません。");
	}
}
