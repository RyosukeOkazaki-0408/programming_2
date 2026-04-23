//VirtPlotGraphのサブクラスのSinVPGraphクラスを書く

public class SinVPGraph extends VirtPlotGraph{

	protected int t;

	public SinVPGraph(char symbol, int t){
		super(symbol);
		this.t = t;
	}

	public int getT(){ return t; }
	public void setT(int t){ this.t = t; }

	@Override public void computeY(){
		setY((int)(Y_MAX*Math.sin(2*Math.PI*getX()/t)));
	}

}
