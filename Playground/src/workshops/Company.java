package workshops;

public class Company {
	
	/*Static variables - shared by all instances of company*/
	public static final int MAX_EMPLOYEES = 100;
	
	/*Instance variables - unique to each instance of Company*/
	public String name;
	public String goodsSold;
	public Employee[] employees = new Employee[MAX_EMPLOYEES];
	public int employeesHired;
	
	public Company(String name, String goods) {
		this.name = name;
		this.goodsSold = goods;
	}
	
	/*Static methods*/
	public static void printMaxEmployee() {
		System.out.println(MAX_EMPLOYEES);
	}
	
	/*Instance methods*/
	public String toString() {
		return String.format("Company name: %s, Goods currently sold at this company: %s", this.name, this.goodsSold);
	}
	
	public int hireEmployee(Employee employee) {
		if (employeesHired == MAX_EMPLOYEES) {
			return 0;
		}
		
		employees[employeesHired] = employee;
		employeesHired += 1;
		return 1;
	}
	
	public boolean sameName(Employee person) {
		for (Employee employee: this.employees) {
			if (employee.name.equals(person.name)) {
				return true;
			}
		}
		return false;
	}

}
