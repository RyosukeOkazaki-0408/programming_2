// int型の整数値を10進数で読み込んで10進数・8進数・16進数で表示

import java.util.Scanner;

class DecOctHex {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数：");
		int x = stdIn.nextInt();

		System.out.printf("10進数では%dです。\n", x);		// 10進数で表示
		System.out.printf(" 8進数では%oです。\n", x);		//  8進数で表示
		System.out.printf("16進数では%xです。\n", x);		// 16進数で表示
	}
}
