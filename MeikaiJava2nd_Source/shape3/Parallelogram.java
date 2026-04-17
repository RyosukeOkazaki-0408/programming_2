//===== 平行四辺形 =====//
public class Parallelogram extends Shape implements Plane2D {
	private int width;			// 底辺の幅
	private int height;			// 高さ

	public Parallelogram(int width, int height) {
		this.width = width;	this.height = height;
	}

	@Override public String toString() {									// 文字列表現 
		return "Parallelogram(width:" + width + ", height:" + height + ")";
	}

	@Override public void draw() {											// 描画
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= height - i; j++) System.out.print(' '); 
			for (int j = 1; j <= width; j++) System.out.print('#'); 
			System.out.println(); 
		}
	}

	@Override public int getArea() { return width * height; }		// ○面積を求める
}
