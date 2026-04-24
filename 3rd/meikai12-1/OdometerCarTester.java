public class OdometerCarTester {
    public static void main(String[] args) {
		Day d = new Day(2027, 10, 15);
		OdometerCar car = new OdometerCar("car", 1885, 1490, 5220, 90.0, d);

        // 動く
        car.move(3, 4);

        // odometerが変化していることを確認
        System.out.println("car.getOdometer() = " + car.getOdometer());
		
        // 動く
        car.move(5.5, 9.5);

        // odometerが変化していることを確認
        System.out.println("car.getOdometer() = " + car.getOdometer());
	}
}