// 配列の複製を生成

import java.util.Scanner;	

class ArrayClone {

	//--- 配列aの複製を生成して返却 ---//
	static int[] cloneOf(int[] a) {
		int[] c = new int[a.length];	// 要素数はaと同じ
		for (int i = 0; i < a.length; i++)
			c[i] = a[i];
		return c;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("要素数：");
		int num = stdIn.nextInt();
		int[] x = new int[num];		// 要素数numの配列

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = stdIn.nextInt();
		}

		int[] y = cloneOf(x);			// 配列xの複製

		System.out.println("配列xの複製yを作りました。");
		for (int i = 0; i < num; i++)
			System.out.println("y[" + i + "] = " + y[i]);
	}
}