// 配列の代入

import java.util.Arrays;

class CopyArray {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {6, 5, 4, 3, 2, 1, 0};

		System.out.println("a = " + Arrays.toString(a));
		System.out.println("b = " + Arrays.toString(b));

		if (a.length != b.length)						// 配列aとbの要素数が異なれば
			b = new int[a.length];						// aと同じ要素数の配列を生成し直す

		for (int i = 0; i < a.length; i++)	// 配列aの全要素を配列bにコピー
			b[i] = a[i];

		a[0] = 10;	// 配列a[0]の値を書きかえる

		System.out.println("aをbに代入してa[0]に10を入れました。 ");
		System.out.println("a = " + Arrays.toString(a));
		System.out.println("b = " + Arrays.toString(b));
	}
}
