package workshops;

public class Employee {
	
	public String name;
	public int age;
	//DONT DO THIS, INFINITE RECURSION 
	//private Employee person = new Employee("what", 2);
	
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public static String toString(Employee employee) {
		return String.format("Employee name: %s, Emplotee Age: %d", employee.name, employee.age);
	}
	
	public String toString() {
		return String.format("Employee name: %s, Emplotee Age: %d", this.name, this.age);
	}
	
	
}
