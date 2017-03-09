
public class Sixteen {

	public static void main(String[] args) {
		final double customers = 15000; // set constants
		final double moreMod = .18;
		final double citrusMod = .58;
		
		double more = customers * moreMod; // calculate number of energy drink buyers
		double citrus = more * citrusMod; // calculate number of people who like Citrus
		
		System.out.printf("Of the 15,000 customers surveyed, %,.0f prefer energy drinks, "
				+ "while %,.0f of those %,.0f prefer Citrus flavored.", more, citrus, more); //output
	}

}
