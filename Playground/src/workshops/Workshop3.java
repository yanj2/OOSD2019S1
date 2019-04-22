package workshops;
import java.util.Arrays;

public class Workshop3 {
	public static void main(String[] args) {
		
		Employee bob = new Employee("Bob", 20);
		Employee robert = new Employee("Bob", 29);
		Company fruits = new Company ("Fruit Wholesale", "Fruit");
		
		fruits.hireEmployee(robert);
		
		if (fruits.sameName(bob)) {
			System.out.println("You have someone in the company with the same name");
		}
		if (fruits.hireEmployee(bob) == 0) {
			System.out.println("Apologies the system is full...");
		}
		
		System.out.println(fruits);
		
		System.out.println(Employee.toString(bob));
		System.out.println(bob);
		
		System.out.println(bob);
		System.out.println(Arrays.toString(fruits.employees));
		System.out.println(Company.MAX_EMPLOYEES);
	}
}
