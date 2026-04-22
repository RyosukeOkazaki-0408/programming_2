// 配列の各要素に5, 4, 3, 2, 1を代入して表示

class IntArray2r {

	public static void main(String[] args) {
		int[] a = new int[5];	// 配列の宣言

		for (int i = 0; i < a.length; i++)
			a[i] = 5 - i;

		for (int i = 0; i < a.length; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}
}
