public class ShiftSupervisor extends Employee{
	private double salary;
	private boolean metGoal;
	private String bonusRef;
	private double yearlyBonus;
	
	public ShiftSupervisor(String name, String num, String date, double sal, boolean meet) {
		super(name, num, date);
		this.setSalary(sal);
		this.setBonus(meet);
	}
	
	public void setYearlyBonus(double bonus){
		yearlyBonus = bonus;
	}
	public void setSalary(double sal){
		salary = sal;
	}
	public void setBonus(boolean meet){
		metGoal = meet;
		if(metGoal){
			bonusRef = "Yes";
			yearlyBonus = 5000.0;
		}else{
			bonusRef = "No";
			yearlyBonus = 0.0;
		}
	}
	
	public double getSalary(){
		return salary;
	}
	public double getPay(){
		return (salary + yearlyBonus);
	}
	public String getBonusRef(){
		return bonusRef;
	}
	
	public String toString(){
		String str;
		str = super.toString() + "\nDept. goals met: " + bonusRef + "\n"
				+ "Salary: $" + salary + "\nEarnings: $" + this.getPay();
		return str;
	}
}