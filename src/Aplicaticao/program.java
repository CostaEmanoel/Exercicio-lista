package Aplicaticao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entites.Employee;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		List<Employee> list = new ArrayList <>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			System.out.println("Emplyoee #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salary: ");
			Double salary = sc.nextDouble();

			System.out.println();
			System.out.println("-------------------");
			System.out.println();
			
			Employee func = new Employee(id, name, salary);
			list.add(func);
		}
		
		
		System.out.print("Enter the employee id that will have salary increase :");
		int aSalary = sc.nextInt();
		
		Employee func = list.stream().filter(i -> i.getId() == aSalary).findFirst().orElse(null);
		
		if (func == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage:");
			double per = sc.nextDouble();
			func.increaseSalary(per);
		}
		System.out.println("-------------------");
		System.out.println();
		System.out.println("List of employees:");
		
		for (Employee ip : list) {
			System.out.println(ip);
		}
		
		
		sc.close();
	}

}
