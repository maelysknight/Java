import javax.swing.JOptionPane;
public class Pennies {
	private int dayCount;
	private double pennyCount = 1;
	
	public void setDays(){
		dayCount = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of days "
				+ "you have worked. Must be more than 1"));
		if(dayCount > 1){
			for(int c = 1; c < dayCount; c++){
				pennyCount *= 2;
			}
		}else{
			System.out.print("\nInvalid number.");
		}
	}
	public double getSalary(){
		return pennyCount *= .01;
	}
}