// StringBuilderの利用例

class StringBuilderTester {

	static void print(StringBuilder sb, String name) {
		System.out.println(name);
		System.out.println("文字列：\"" + sb + "\"");
		System.out.println("長　さ：" + sb.length());
		System.out.println("容　量：" + sb.capacity());
	}

	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder();
		StringBuilder s2 = new StringBuilder(12);
		StringBuilder s3 = new StringBuilder("ABC");

		print(s1, "s1");
		print(s2, "s2");
		print(s3, "s3");

		s3.append("DEF");
		print(s3, "s3");

		s3.insert(4, 3.14);		// 3.14の文字列表現"3.14"を挿入
		print(s3, "s3");

		s3.delete(1, 4);			// インデックス1～3の文字を削除
		print(s3, "s3");
	}
}
