public class SawToothVPGraph extends SinVPGraph {

	// コンストラクタ
	public SawToothVPGraph(char symbol, int t) {
		super(symbol, t);
	}

	// のこぎり関数を調べて公式のようなものを記述した
	@Override
	public void computeY() {
		setY((int)(2*Y_MAX/t)*(getX()%t)-Y_MAX);
	}

}
