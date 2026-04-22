// 2行3列の行列を加算する（構成要素を表示）

import java.util.Arrays;

class Matrix2 {

	public static void main(String[] args) {
		int[][] a = { {1, 2, 3}, {4, 5, 6} };
		int[][] b = { {6, 3, 4}, {5, 1, 2} };
		int[][] c = { {0, 0, 0}, {0, 0, 0} };

		for (int i = 0; i < 2; i++)
			for (int j = 0; j < 3; j++)
				c[i][j] = a[i][j] + b[i][j];

		System.out.println("行列a = " + Arrays.toString(a));
		System.out.println("行列b = " + Arrays.toString(b));
		System.out.println("行列c = " + Arrays.toString(c));
	}
}
