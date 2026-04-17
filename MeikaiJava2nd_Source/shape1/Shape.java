// 図形クラス群【第１版】

//===== 図形 =====//
abstract class Shape {
	abstract void draw();					// 描画（抽象メソッド）
}

//===== 点 =====//
class Point extends Shape {
	Point() { }															// コンストラクタ

	@Override void draw() {									// 描画
		System.out.println('+'); 
	}
}

//===== 長方形 =====//
class Rectangle extends Shape {
	private int width;		// 幅
	private int height;		// 高さ

	Rectangle(int width, int height) {			// コンストラクタ
		this.width = width;
		this.height = height;
	}

	@Override void draw() {									// 描画
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++)
				System.out.print('*'); 
			System.out.println(); 
		}
	}
}
