// 図形クラス群【第２版】の利用例

class ShapeTester {

	public static void main(String[] args) {
		Shape[] p = new Shape[4];

		p[0] = new Point();					// 点
		p[1] = new HorzLine(5);			// 水平直線
		p[2] = new VertLine(3);			// 垂直直線
		p[3] = new Rectangle(4, 3);	// 長方形

		for (Shape s : p) {
			s.print();
			System.out.println();
		}
	}
}
