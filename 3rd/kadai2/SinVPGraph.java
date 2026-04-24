public class SinVPGraph extends VirtPlotGraph{

	protected int t;

	// コンストラクタ
	public SinVPGraph(char symbol, int t){
		super(symbol);
		this.t = t;
	}

	// ゲッタとセッタ
	public int getT(){ return t; }
	public void setT(int t){ this.t = t; }

	// Asinωtをsetしている
	@Override public void computeY(){
		setY((int)(Y_MAX*Math.sin(2*Math.PI*getX()/t)));
	}

}
