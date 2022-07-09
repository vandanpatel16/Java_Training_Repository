package com.java.doublestream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	
	int id;
	String name;
	double salary;
	
	public Employee() {
		
	}
	
	public Employee (int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
}

public class Assignment17_DoubleStream_collect {

	public static void main(String[] args) {
		
		List<Employee> employeelist = new ArrayList<Employee>(); 
		employeelist.add(new Employee(1, "Sam", 30000.0d));
		employeelist.add(new Employee(2, "Elisabeth", 50000.0d));
		employeelist.add(new Employee(3, "George", 45000.0d));
		employeelist.add(new Employee(4, "Clark", 80000.0d));
		employeelist.add(new Employee(5, "Danial", 25000.0d));
		employeelist.add(new Employee(6, "Rose", 45000.0d));
		employeelist.add(new Employee(7, "Megan", 30000.0d));
		employeelist.add(new Employee(8, "Taylor", 80000.0d));
		
		List<Double> emp = employeelist.stream().filter(p->p.salary<=45000.0d).map(p->p.salary).collect(Collectors.toList());
		System.out.println(emp);
	}

}
