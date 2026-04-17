// 自動車クラス【第２版】の利用例（その１）

class CarTester1 {

	public static void main(String[] args) {
		Day d = new Day(2027, 10, 15);
		Car myCar = new Car("愛車", 1885, 1490, 5220, 90.0, d);

		Day p = myCar.getPurchaseDay();
		System.out.println("愛車の購入日：" + p);

		p.set(1999, 12, 31);		// 購入日を書きかえる（？）

		Day q = myCar.getPurchaseDay();
		System.out.println("愛車の購入日：" + q);
	}
}
