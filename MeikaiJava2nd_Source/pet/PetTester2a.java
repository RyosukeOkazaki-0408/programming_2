// ペットクラスの利用例（メソッドの引数で多相性を検証：基本for文）

class PetTester2a {

	// pが参照するインスタンスに自己紹介させる
	static void intro(Pet p) {
		p.introduce();
	}

	public static void main(String[] args) {
		Pet[] a = {
			new Pet("Kurt", "アイ"),
			new RobotPet("R2D2", "ルーク"),
			new Pet("マイケル", "英男"),
		};

		for (int i = 0; i < a.length; i++) {
			intro(a[i]);					// pが参照するインスタンスに自己紹介させる
			System.out.println();
		}
	}
}
