public class CarLauncher {
	public static void main(String[] args) {
		Car ford = new Car(2007,"Ford");
		
		ford.accelerate();
		System.out.println("Speed: " + ford.getSpeed());
		ford.accelerate();
		System.out.println("Speed: " + ford.getSpeed());
		ford.accelerate();
		System.out.println("Speed: " + ford.getSpeed());
		ford.accelerate();
		System.out.println("Speed: " + ford.getSpeed());
		ford.accelerate();
		System.out.println("Speed: " + ford.getSpeed());
		ford.brake();
		System.out.println("Speed: " + ford.getSpeed());
		ford.brake();
		System.out.println("Speed: " + ford.getSpeed());
		ford.brake();
		System.out.println("Speed: " + ford.getSpeed());
		ford.brake();
		System.out.println("Speed: " + ford.getSpeed());
		ford.brake();
		System.out.println("Speed: " + ford.getSpeed());
	}
}
