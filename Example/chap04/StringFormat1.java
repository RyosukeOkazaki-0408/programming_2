// String.formatメソッドによる書式文字列の作成（その１）

class StringFormat1 {
 
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			String f = String.format("%%%dd\n", i);		// "%id"を作る（iは数値）
			System.out.printf(f, 5);
		}
	}
}
