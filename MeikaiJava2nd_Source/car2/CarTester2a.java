// 自動車クラス【第２版】の利用例（その２）

class CarTester2a {

	public static void main(String[] args) {
		Day pd = new Day(2000, 11, 18);
		Car myCar = new Car("愛車", 1885, 1490, 5220, 90.0, pd);

		myCar.putSpec();
		System.out.println("購入日：" + myCar.getPurchaseDay().toString());
	}
}
