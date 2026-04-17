// 連番クラスIdを書く
// mainメソッドを含むIdTesterクラスを書く

class ExId {
	private static int counter = 0;	
    private static int n = 1;
	private int id;			

	public ExId() {
        id = counter + n;
        counter = id;
    }

	public int getId() { return id; }
    public static int getN() { return n; }
    public static int getMaxId() { return counter; }

    public static void setN(int n) { ExId.n = n; }
}

public class ExIdTester {

	public static void main(String[] args) {
		ExId a = new ExId();
		ExId b = new ExId();
		ExId c = new ExId();

        //n = 3;
        ExId.setN(3);

        ExId d = new ExId();
		ExId e = new ExId();
		ExId f = new ExId();

		System.out.println("a.getId() = " + a.getId());
		System.out.println("b.getId() = " + b.getId());
		System.out.println("c.getId() = " + c.getId());
		System.out.println("d.getId() = " + d.getId());
		System.out.println("e.getId() = " + e.getId());
		System.out.println("f.getId() = " + f.getId());

	}
}
