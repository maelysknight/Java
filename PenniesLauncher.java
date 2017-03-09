public class PenniesLauncher {
	public static void main(String[] args) {
		Pennies calc = new Pennies();
		calc.setDays();
		double result = calc.getSalary();
		if(result >= .02)
		System.out.printf("Your salary is $%,.2f", result);
		System.exit(0);
	}
}