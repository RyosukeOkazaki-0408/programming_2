// 文字列探索（indexOf系メソッド）

import java.util.Scanner;

class IndexOf {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("文字列s1：");  String s1 = stdIn.next();
		System.out.print("文字列s2：");  String s2 = stdIn.next();
		System.out.print("先頭インデックス：");  int begin = stdIn.nextInt();

		System.out.println("s.indexOf(s2)            = " + s1.indexOf(s2));
		System.out.println("s.indexOf(s2, begin)     = " + s1.indexOf(s2, begin));
		System.out.println("s.lastIndexOf(s2)        = " + s1.lastIndexOf(s2));
		System.out.println("s.lastIndexOf(s2, begin) = " + s1.lastIndexOf(s2, begin));
	}
}
