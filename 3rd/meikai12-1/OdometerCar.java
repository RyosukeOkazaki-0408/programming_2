public class OdometerCar extends Car{
    private double odometer;
    OdometerCar(String name, int width, int height, int length, double fuel,
    Day purchaseDay) {
        super(name, width, height, length, fuel, purchaseDay);
        odometer = 0.0;
    }

    public double getOdometer() {
        return odometer;
    }

    @Override
	public boolean move(double dx, double dy) {
        double dist = Math.sqrt(dx * dx + dy * dy);

		if(super.move(dx, dy)) {
            odometer += dist;
			return true;
		}
        return false;
	}
}