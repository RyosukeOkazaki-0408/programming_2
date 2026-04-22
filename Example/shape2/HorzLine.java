/**
 * クラスHorzLineは水平直線を表すクラスです。
 * このクラスは、直線を表す抽象クラスAbstLineから派生したクラスです。
 * @author 柴田望洋
 * @see Shape
 * @see AbstLine
*/
public class HorzLine extends AbstLine {

	/**
	 * 水平直線を生成するコンストラクタです。
	 * 長さを引数として受け取ります。
	 * @param length 生成する直線の長さ。
	*/
	public HorzLine(int length) { super(length); }

	/**
	 * メソッドtoStringは、水平直線に関する図形情報を表す文字列を返却します。
	 * @return 文字列"HorzLine(length:3)"を返却します。
	 *         3の部分は長さに応じた値です。
	*/
	@Override public String toString() {
		return "HorzLine(length:" + getLength() + ")"; 
	}

	/**
	 * メソッドdrawは、水平直線を描画します。
	 * 描画は、マイナス記号'-'を横に並べることによって行います。
	 * 長さの個数だけ'-'を連続表示して改行します。
	*/
	public void draw() {
		for (int i = 1; i <= getLength(); i++)
			System.out.print('-'); 
		System.out.println(); 
	}
}
