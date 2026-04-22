// 日付クラスDay【第４版】の利用例：インスタンスメソッド版による閏年の判定

import java.util.Scanner;

class IsLeapTester {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("西暦年：");
		int y = stdIn.nextInt();
		System.out.println("その年は閏年" + (new Day(y).isLeap() ? "です。" 
																											: "ではありません。"));
	}
}
