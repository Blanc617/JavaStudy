package extends01.ex3;

public class CarMain {

	public static void main(String[] args) {

		ElectricCar electricCar = new ElectricCar();
		electricCar.move();
		electricCar.charge();
		electricCar.openDoor();
		
		GasCar gasCar = new GasCar();
		gasCar.move();
		gasCar.fillUp();
		gasCar.openDoor();
		
		HydrogenCar HydrogenCar = new HydrogenCar();
		HydrogenCar.move();
		HydrogenCar.fillHydrogen();
		HydrogenCar.openDoor();
	}

}
