// 二つの変数xとyの合計と平均を表示（誤り）

class SumAve1x {

	public static void main(String[] args) {
		int x;			// xはint型の変数
		int y;			// yはint型の変数

		x = 63.5;		// xに63.5を代入
		y = 18.6;		// yに18.6を代入

		System.out.println("xの値は" + x + "です。");					  // xの値を表示
		System.out.println("yの値は" + y + "です。");			  		// yの値を表示
		System.out.println("合計は" + (x + y) + "です。");		  // 合計を表示
		System.out.println("平均は" + (x + y) / 2 + "です。");  // 平均を表示
	}
}
