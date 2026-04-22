// 二つの整数値の最大値を求める（条件演算子を利用）

import java.util.Scanner;

class Max2Method2 {

	//--- a, bの最大値を返却 ---//
	static int max2(int a, int b) {
		return (a > b) ? a : b;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数a：");  int a = stdIn.nextInt();
		System.out.print("整数b：");  int b = stdIn.nextInt();

		System.out.println("最大値は" + max2(a, b) + "です。");
	}
}
