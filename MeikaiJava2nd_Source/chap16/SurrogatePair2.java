// サロゲードペア（その２：本プログラムはUTF-8で保存されていることが前提です）

import java.util.Scanner;

class SurrogatePair2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		String s = "ABC𠮷𠀋𥔎XYZ";
		int len = s.codePointCount(0, s.length());
		System.out.println("文字数 = " + len);

		for (int i = 0; i < len; i++)
			System.out.print(s.substring(
												s.offsetByCodePoints(0, i), s.offsetByCodePoints(0, i + 1)
											) + " ");
		System.out.println();
	}
}
