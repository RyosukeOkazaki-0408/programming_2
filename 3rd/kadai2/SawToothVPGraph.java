// SinVPGraphのサブクラスのSawToothVPGraphクラスを書く

public class SawToothVPGraph extends SinVPGraph{

	public SawToothVPGraph(String symbol, int t){
		super(symbol, t);
	}

	@Override public void computeY(){
		setY((2*Y_MAX/t)*(super.x-Math.floor(super.x/t)*t)-Y_MAX);
	}

}
