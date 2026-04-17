// short型下位４ビットをマスク／セット／反転

import java.util.Scanner;

class Mask {

//--- int型のビット構成を表示 ---//
static void printBits(int x) {
	for (int i = 31; i >= 0; i--)
		System.out.print(((x >>> i & 1) == 1)	? '1' : '0');
}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数：");
		short n = stdIn.nextShort();
		
		System.out.print("\nその値 = ");  printBits(n);
		System.out.print("\nマスク = ");  printBits(n & 0b1111111111110000);
		System.out.print("\nセット = ");  printBits(n | 0b0000000000001111);
		System.out.print("\n反転   = ");  printBits(n ^ 0b0000000000001111);
	}
}
