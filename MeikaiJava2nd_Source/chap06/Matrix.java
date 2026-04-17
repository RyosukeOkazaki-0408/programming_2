// 2行3列の行列を加算する

import java.util.Arrays;

class Matrix {

	public static void main(String[] args) {
		int[][] a = { {1, 2, 3}, {4, 5, 6} };
		int[][] b = { {6, 3, 4}, {5, 1, 2} };
		int[][] c = { {0, 0, 0}, {0, 0, 0} };

		for (int i = 0; i < 2; i++)
			for (int j = 0; j < 3; j++)
				c[i][j] = a[i][j] + b[i][j];

		System.out.println("行列a = " + Arrays.deepToString(a));
		System.out.println("行列b = " + Arrays.deepToString(b));
		System.out.println("行列c = " + Arrays.deepToString(c));
	}
}
