// 三つの整数値の最大値を求める（メソッド版：実引数が整数リテラル）

import java.util.Scanner;

class Max3Literal {

	//--- a, b, cの最大値を返却 ---//
	static int max(int a, int b, int c) {
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		return max;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("32と57と48の最大値は" + max(32, 57, 48) + "です。");
	}
}
