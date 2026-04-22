// String型の参照と生成

class StringNew {

	public static void main(String[] args) {
		String x = "ABC";								// xは文字列リテラル"ABC"用インスタンスを参照
		String y = new String("ABC");		// yは新しく作られるインスタンスを参照

		System.out.println("x == y     : " + (x == y));
		System.out.println("x == \"ABC\" : "   + (x == "ABC"));
		System.out.println("y == \"ABC\" : "   + (y == "ABC"));
	}
}
