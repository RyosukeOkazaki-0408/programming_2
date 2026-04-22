// 二つの変数を降順（大きい順）にソート

import java.util.Scanner;

class Sort2Descending {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("変数a：");  int a = stdIn.nextInt();
		System.out.print("変数b：");  int b = stdIn.nextInt();

		if (a < b) {	// aがbより小さければ
			int t = a;	// それらの値を交換
			a = b;
			b = t;
		}

		System.out.println("降順にソートしました。");

		System.out.println("変数aは" + a + "です。");
		System.out.println("変数bは" + b + "です。");
	}
}
