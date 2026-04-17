// 日付クラスDay【第４版】の利用例

import java.util.Scanner;

class DayTester {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int y, m, d;

		System.out.print("西暦年：");
		y = stdIn.nextInt();
		System.out.println("その年は閏年" + 
														(Day.isLeap(y) ? "です。" : "ではありません。"));

		System.out.println("日付を入力せよ。");
		System.out.print("年：");  y = stdIn.nextInt();
		System.out.print("月：");  m = stdIn.nextInt();
		System.out.print("日：");  d = stdIn.nextInt();
		Day a = new Day(y, m, d);	// 読み込んだ日付
		System.out.println(a.getYear() + "年は閏年" + 
														(a.isLeap() ? "です。" : "ではありません。"));
	}
}
