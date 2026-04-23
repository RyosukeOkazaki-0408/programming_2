// SinVPGraphのサブクラスのSawToothVPGraphクラスを書く

public class SawToothVPGraph extends SinVPGraph {

	public SawToothVPGraph(char symbol, int t) {
		super(symbol, t);
	}

	@Override
	public void computeY() {
		setY((int)(2*Y_MAX/t)*(getX()%t)-Y_MAX);
	}

}
