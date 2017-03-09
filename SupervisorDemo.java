public class SupervisorDemo {
	public static void main(String[] args){
		ShiftSupervisor worker1 = new ShiftSupervisor("Victor Wan", "777-S", "11/11/11", 80000.0, true);
		ShiftSupervisor worker2 = new ShiftSupervisor("John Doe", "324-G", "12/12/12", 50000.0, false);
		
		System.out.print(worker1.toString() + "\n\n" + worker2.toString());
	}
}