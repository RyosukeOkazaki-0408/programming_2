// 配列の代入（誤り）

import java.util.Arrays;

class AssignArray {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {6, 5, 4, 3, 2, 1, 0};

		System.out.println("a = " + Arrays.toString(a));
		System.out.println("b = " + Arrays.toString(b));

		b = a;			// 配列aをbにコピー（？）

		a[0] = 10;	// 配列a[0]の値を書きかえる

		System.out.println("aをbに代入してa[0]に10を入れました。 ");
		System.out.println("a = " + Arrays.toString(a));
		System.out.println("b = " + Arrays.toString(b));
	}
}
