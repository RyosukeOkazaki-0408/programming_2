// instanceof演算子の利用例

class PetInstanceOfX {

	public static void main(String[] args) {
		Pet[] a = {
			new Pet("Kurt", "アイ"),
			new RobotPet("R2D2", "ルーク"),
			new Pet("マイケル", "英男"),
		};

		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] ");
			if (a[i] instanceof Pet)		// Petを含めてPetの下位クラスであればtrueとなる
				a[i].introduce();					// すなわちa[i]がPetでもRobotPetでも実行される
			else
					((RobotPet)a[i]).work(0);	// 実行されない
		}
	}
}
