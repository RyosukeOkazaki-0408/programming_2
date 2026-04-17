// 配列変数の値を表示

import java.util.Scanner;

class PrintArray {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("要素数：");
		int n = stdIn.nextInt();		// 要素数を読み込む
		int[] a = new int[n];
		System.out.println("a = " + a);

		a = null;
		System.out.println("a = " + a);
	}
}