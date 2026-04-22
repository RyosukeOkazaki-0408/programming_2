/**
 * クラスRectangleは、長方形を表すクラスです。
 * このクラスは、図形を表す抽象クラスShapeから派生したクラスです。
 * @author 柴田望洋
 * @see Shape
*/
public class Rectangle extends Shape {

	/**
	 * 長方形の幅を表すint型のフィールドです。
	*/
	private int width;

	/**
	 * 長方形の高さを表すint型のフィールドです。
	*/
	private int height;

	/**
	 * 長方形を生成するコンストラクタです。
	 * 幅と高さを引数として受け取ります。
	 * @param width  長方形の幅。
	 * @param height 長方形の高さ。
	*/
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	/**
	 * メソッドtoStringは、長方形に関する図形情報を表す文字列を返却します。
	 * @return 文字列"Rectangle(width:4, height:3)"を返却します。
	 *         4と3の部分は、それぞれ幅と高さに応じた値です。
	*/
	@Override public String toString() {
		return "Rectangle(width:" + width + ", height:" + height + ")"; 
	}

	/**
	 * メソッドdrawは、長方形を描画します。
	 * 描画は、アステリスク記号'*'を並べることによって行います。
	 * 幅の個数だけ'*'を表示して改行するのをwidth回だけ繰り返します。
	*/
	@Override public void draw() {
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++)
				System.out.print('*'); 
			System.out.println(); 
		}
	}
}
