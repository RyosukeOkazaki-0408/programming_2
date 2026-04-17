// インタフェース（静的メソッド／デフォルトメソッド／非公開メソッド）

interface A {

	// 静的メソッド（"Hello!"と表示）
	static void hello() {
		System.out.println("Hello!");
	}

	// 非公開メソッド（"s1 : s2"を表示して改行）
	private void print(String s1, String s2) {
		System.out.println(s1 + " : " + s2);
	}

	// デフォルトメソッド
	default void On() {
		print("default", "On!");
	}

	// 通常のメソッド（公開／非静的／非デフォルト）
	void Off();
}

class A1 implements A {				// デフォルトメソッドOnをオーバライドしていない
	@Override public void Off() { System.out.println("A1 : Off!"); }
}

class A2 implements A {
	@Override public void On()  { System.out.println("A2 : On!");  }
	@Override public void Off() { System.out.println("A2 : Off!"); }
}

public class InterfaceTester {

	public static void main(String[] args) {
		A.hello();								// 静的メソッドの呼出し

		A1 a1 = new A1();
		a1.On();									// デフォルトメソッドが呼び出される
		a1.Off();

		A2 a2 = new A2();
		a2.On();
		a2.Off();
	}
}
