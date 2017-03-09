public class Employee {
	private String employeeName;
	private String employeeNumber;
	private String hireDate;
	
	public Employee(String name, String num, String date){
		this.setName(name);
		this.setNumber(num);
		this.setHireDate(date);
	}
	
	public void setName(String name){
		employeeName = name;
	}
	public void setNumber(String num){
		employeeNumber = num;
	}
	public void setHireDate(String date){
		hireDate = date;
	}
	
	public String getName(){
		return employeeName;
	}
	public String getNumber(){
		return employeeNumber;
	}
	public String getHireDate(){
		return hireDate;
	}
	
	public String toString(){
		String str;
		str = "***** New Employee *****\n"
				+ "Employee Name: " + this.employeeName + "\n"
				+ "Employee Number: " + this.employeeNumber + "\n"
				+ "Hire Date: " + this.hireDate;
		return str;
	}
}