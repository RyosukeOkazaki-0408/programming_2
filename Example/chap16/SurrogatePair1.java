// サロゲードペア（その１：本プログラムはUTF-8で保存されていることが前提です）

import java.util.Scanner;

class SurrogatePair1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		String s = "ABC𠮷𠀋𥔎XYZ";

		System.out.println("s.length() = " + s.length());

		for (int i = 0; i < s.length(); i++)
			System.out.print(s.charAt(i) + " ");
		System.out.println();
	}
}
