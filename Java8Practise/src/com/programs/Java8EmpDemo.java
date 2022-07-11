package com.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8EmpDemo {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<Employee>();

		empList.add(new Employee(1, 500));
		empList.add(new Employee(2, 1000));
		empList.add(new Employee(3, 1500));
		empList.add(new Employee(4, 350));
		empList.add(new Employee(5, 4000));
		empList.add(new Employee(6, 7000));

		// sort employee based on theire salaries in desc order
		List<Employee> e=empList.stream().sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary())).skip(3).collect(Collectors.toList());
		System.out.println(e);
		
		String str="sdfvsdf68fsdfsf8999fsdf09";
		String numberOnly= str.replaceAll("[^0-9]", "");
		
		System.out.println(numberOnly);
		
		String s = "helloThisIsA1234Sample";
		s = s.replaceAll("\\D+","");
		System.out.println(s);
	}
}
