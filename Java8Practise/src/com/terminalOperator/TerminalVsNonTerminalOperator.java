package com.terminalOperator;

import java.util.Arrays;
import java.util.List;

public class TerminalVsNonTerminalOperator {

	public static void main(String[] args) {
		
		Employee e1= new Employee(1, "Abhi");
		Employee e2= new Employee(3, "RMAMAM");
		Employee e3= new Employee(56, "XCCS");
		Employee e4= new Employee(10, "QAEE");
		
		List<Employee> eList=Arrays.asList(e1,e2,e3,e4);
		
		eList.stream().filter(e->e.getId()>=10).forEach(b->System.out.println(b));
		
		eList.stream().filter(e->e.getName()=="Abhi").forEach(c->System.out.println(c));
	}

}

class Employee{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
