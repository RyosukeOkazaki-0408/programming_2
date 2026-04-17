// 読み込んだ二つの整数値の小さいほうの値を表示（条件演算子：その２）

import java.util.Scanner;

class Min2Cond2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数a：");  int a = stdIn.nextInt();
		System.out.print("整数b：");  int b = stdIn.nextInt();

		System.out.println("小さいのは" + (a < b ? a : b) + "です。");
	}
}
