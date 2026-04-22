public class OdometerCar extends Car{
    private double odometer, x, y, fuel;
    OdometerCar(String name, int width, int height, int length, double fuel,
    Day purchaseDay) {
        super(name, width, height, length, fuel, purchaseDay);
        odometer = 0.0;
        this.x = getX();
        this.y = getY();
        this.fuel = getFuel();
    }

    public double getOdometer() {
        return odometer;
    }

    //--- Ｘ方向にdx・Ｙ方向にdy移動 ---//
    @Override
	public boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy * dy);		// 移動距離

		if (dist > fuel)
        return false;				// 移動できない　… 燃料不足
		else {
            odometer += dist;
			fuel -= dist;				// 移動距離の分だけ燃料が減る
			x += dx;
			y += dy;
			return true;				// 移動完了
		}
	}
}