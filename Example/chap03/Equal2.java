// 読み込んだ二つの整数値は等しいか（!=演算子）

import java.util.Scanner;

class Equal2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数a：");  int a = stdIn.nextInt();
		System.out.print("整数b：");  int b = stdIn.nextInt();

		if (a != b)
			System.out.println("二つの値は等しくありません。");
		else
			System.out.println("二つの値は等しいです。");
	}
}
