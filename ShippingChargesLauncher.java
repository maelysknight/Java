import javax.swing.JOptionPane;
public class ShippingChargesLauncher {
	public static void main(String[] args) {
		String weightInput = JOptionPane.showInputDialog("Enter the weight of your package (in kilograms)");
		String distInput = JOptionPane.showInputDialog("Enter the distance your package will travel");
		double weight = Double.parseDouble(weightInput);
		double distance = Double.parseDouble(distInput);
		ShippingCharges calc = new ShippingCharges(weight,distance);
		
		System.out.printf("Your shipping price will be $%.2f", calc.getPrice());
	}
}