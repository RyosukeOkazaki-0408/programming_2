/**
 * クラスVertLineは垂直直線を表すクラスです。
 * このクラスは、直線を表す抽象クラスAbstLineから派生したクラスです。
 * @author 柴田望洋
 * @see Shape
 * @see AbstLine
*/
public class VertLine extends AbstLine {

	/**
	 * 垂直直線を生成するコンストラクタです。
	 * 長さを引数として受け取ります。
	 * @param length 生成する直線の長さ。
	*/
	public VertLine(int length) { super(length); }

	/**
	 * メソッドtoStringは、垂直直線に関する図形情報を表す文字列を返却します。
	 * @return 文字列"VertLine(length:3)"を返却します。
	 *         3の部分は長さに応じた値です。
	*/
	@Override public String toString() {
		return "VertLine(length:" + getLength() + ")";
	}

	/**
	 * メソッドdrawは、垂直直線を描画します。
	 * 描画は、縦線記号'|'を縦に並べることによって行います。
	 * 長さの個数だけ'|'を表示して改行するのを繰り返します。
	*/
	@Override public void draw() {
		for (int i = 1; i <= getLength(); i++)
			System.out.println('|'); 
	}
}
