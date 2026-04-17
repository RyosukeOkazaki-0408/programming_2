// 連番クラスIdを書く
// mainメソッドを含むIdTesterクラスを書く

class Id {
	private static int counter = 0;		

	private int id;			

	public Id() { id = ++counter; }

	public int getId() { return id; }

    public static int getMaxId() { return counter; }
}

public class IdTester {

	public static void main(String[] args) {
		Id a = new Id();
		Id b = new Id();

		System.out.println("a.getId() = " + a.getId());
		System.out.println("b.getId() = " + b.getId());

		System.out.println("getMaxId() = " + Id.getMaxId());
	}
}
