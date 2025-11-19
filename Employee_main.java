package tp_02;

public class Employee_main {
	public static void main(String[] args) {
		Employee intern = new Employee(); //makes new employee object with no attributes
		intern.setName("Ahmed ");//sets it's name attribute to ahmed using method SetName
		intern.setAge(20);//sets it's Age attribute to 20 using method setAge
		intern.setSalary(1000);//sets it's Salary attribute to 1000 using Setsalary method
		System.out.println(intern.Tostring());//print's the employee details using the tostring function
		intern.salaryinc(100.00);//inceares the salary of the employee by a percentage of 100%
		System.out.println(intern.Tostring());
		intern.salaryinc(2000);//increases the salary of the employee by a fixed amount
		System.out.println(intern.Tostring());
		
	}

}
