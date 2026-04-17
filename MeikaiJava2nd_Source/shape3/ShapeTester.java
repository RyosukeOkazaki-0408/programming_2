// 図形クラス群【第３版】の利用例

class ShapeTester {

	public static void main(String[] args) {

		Plane2D[] p1 = {
			new Rectangle(4, 3),			// 長方形
			new Parallelogram(5, 3),	// 平行四辺形
		};

		for (int i = 0; i < p1.length; i++) {
			System.out.printf("p1[%d]の面積＝%d\n", i, p1[i].getArea());
		}

		Shape[] p2 = {
			new Point(),							// 点
			new HorzLine(5),					// 水平直線
			new VertLine(3),					// 垂直直線
			new Rectangle(4, 3),			// 長方形
			new Parallelogram(5, 3),	// 平行四辺形
		};

		for (Shape s : p2) {
			if (s instanceof Plane2D) {
				s.print();
				System.out.println("面積＝" + ((Plane2D)s).getArea());
			}
		}
	}
}
