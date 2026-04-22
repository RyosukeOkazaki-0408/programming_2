public class OdometerCarTester {
    public static void main(String[] args) {
		Day d = new Day(2027, 10, 15);
		OdometerCar car = new OdometerCar("car", 1885, 1490, 5220, 90.0, d);

        car.move(3, 4);
        System.out.println("car.getOdometer() = " + car.getOdometer());
		
        car.move(5.5, 9.5);
        System.out.println("car.getOdometer() = " + car.getOdometer());
	}
}