// ペットクラスの利用例（メソッドの引数で多相性を検証）

class PetTester2 {

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

		for (Pet p : a) {
			intro(p);					// pが参照するインスタンスに自己紹介させる
			System.out.println();
		}
	}
}
