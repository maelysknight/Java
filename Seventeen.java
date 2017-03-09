import javax.swing.JOptionPane;
public class Seventeen {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Please enter your name.");
		String age = JOptionPane.showInputDialog("Please enter a number.");
		String city = JOptionPane.showInputDialog("Please enter a city.");
		String college = JOptionPane.showInputDialog("Please enter a college.");
		String job = JOptionPane.showInputDialog("Please enter a profession.");
		String pet = JOptionPane.showInputDialog("Please enter an animal.");
		String petName = JOptionPane.showInputDialog("Please enter another name.");
		
		System.out.printf("There once was a person named %s who lived in %s. At the age of %s,\n "
				+ "%s went to college at %s. %s graduated and went to work at their favorite job, %s.\n "
				+ "Then, %s adopted a pet %s named %s. They both lived happily ever after!"
				, name, city, age, name, college, name, job, name, pet, petName);
	}

}
