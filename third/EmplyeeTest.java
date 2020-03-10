
package com.capgemini.third;

public class EmplyeeTest {
	public static void main(String[] args) {
		Employee[] employees = new Employee[4];
		Employee e1 = new Employee(101, "vinod", 35000);
		Employee e2 = new Employee(102, "chandra", 35000);
		Employee e3 = new Employee(103, "kumar", 35000);
		Employee e4 = new Employee(104, "siva", 35000);
		employees[0] = e1;
		employees[1] = e2;
		employees[2] = e3;
		employees[3] = e4;
		printEmployeeDetails(employees);
		Employee[] names = GetEmployeeDetails();
		printEmployeeDetails(names);

	}

	static void printEmployeeDetails(Employee[] emp) {
		for (int i = 0; i < emp.length; i++) {
			System.out.println("name--" + emp[i].name);
			System.out.println("id--" + emp[i].id);
			System.out.println("salary--" + emp[i].salary);
		}
	}

	static Employee[] GetEmployeeDetails() {
		Employee[] employees = new Employee[4];
		Employee e1 = new Employee(201, "suri", 35000);
		Employee e2 = new Employee(202, "mahi", 35000);
		Employee e3 = new Employee(203, "prathap", 35000);
		Employee e4 = new Employee(204, "sahith", 35000);
		employees[0] = e1;
		employees[1] = e2;
		employees[2] = e3;
		employees[3] = e4;
		return employees;
	}
}
