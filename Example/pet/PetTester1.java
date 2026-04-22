// ペットクラスの利用例（多相性の検証）

import java.util.Scanner;

class PetTester1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Pet kurt = new Pet("Kurt", "アイ");
		kurt.introduce();
		System.out.println();

		RobotPet r2d2 = new RobotPet("R2D2", "ルーク");
		r2d2.introduce();
		System.out.println();

		System.out.print("(1)Kurt (2)R2D2：");
		int sw = stdIn.nextInt();
		Pet p;
		if (sw == 1)
			p = kurt;			// pはPet型インスタンスを参照する
		else
			p = r2d2;			// pはRobotPet型インスタンスを参照する
		p.introduce();	// pの参照先は、PetとRobotPetのどちら？
	}
}
