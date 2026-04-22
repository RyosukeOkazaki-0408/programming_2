// instanceof演算子の利用例

class PetInstanceOf {

	public static void main(String[] args) {
		Pet[] a = {
			new Pet("Kurt", "アイ"),
			new RobotPet("R2D2", "ルーク"),
			new Pet("マイケル", "英男"),
		};

		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] ");
			if (a[i] instanceof RobotPet)		// a[i]がロボットであれば…
				((RobotPet)a[i]).work(0);			// 　家事（掃除）を命じる
			else														// そうでなければ…
				a[i].introduce();							// 　自己紹介を命じる
		}
	}
}
