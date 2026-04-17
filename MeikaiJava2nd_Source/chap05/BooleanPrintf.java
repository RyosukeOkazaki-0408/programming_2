// 関係演算子・等価演算子・論理否定演算子が生成する値を表示（printfメソッド）

import java.util.Scanner;

class BooleanPrintf {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数a："); int a = stdIn.nextInt();
		System.out.print("整数b："); int b = stdIn.nextInt();

		System.out.printf("a <  b  = %b\n", a <  b);
		System.out.printf("a <= b  = %b\n", a <= b);
		System.out.printf("a >  b  = %b\n", a >  b);
		System.out.printf("a >= b  = %b\n", a >= b);
		System.out.printf("a == b  = %b\n", a == b);
		System.out.printf("a != b  = %b\n", a != b);
		System.out.printf("!(a==0) = %b\n", !(a == 0));
		System.out.printf("!(b==0) = %b\n", !(b == 0));
	}
}
