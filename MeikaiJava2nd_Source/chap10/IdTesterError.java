// 識別番号クラス（その１：誤り）

public class IdE {
	static int counter = 0;		// 何番までの識別番号を与えたか

	private int id;				// 識別番号

	//--- コンストラクタ ---//
	public IdE() {
		id = ++counter;			// 識別番号
	}

	//--- 識別番号を取得 ---//
	public int getId() {
		return id;
	}
}

public class IdTesterError {

	public static void main(String[] args) {
		IdE a = new IdE();		// 識別番号１番
		IdE b = new IdE();		// 識別番号２番

		System.out.println("aの識別番号：" + a.getId());
		System.out.println("bの識別番号：" + b.getId());

		System.out.println("IdE.counter = " + IdE.counter);
		System.out.println("a.counter  = " +  a.counter);
		System.out.println("b.counter  = " +  b.counter);
	}
}
