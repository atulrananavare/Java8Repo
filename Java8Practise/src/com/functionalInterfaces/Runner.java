package com.functionalInterfaces;

public class Runner implements MyFunctional {

	public static void main(String[] args) {
	
		MyFunctional inter=(i1,i2)->System.out.println(i1*i2);
		inter.myMethod(10, 20);
		
		MyFunctional.m2();
		
		
		

	}

	@Override
	public void myMethod(int a, int b) {
		
		
	}
	@Override
	public void m1() {
		System.out.println("This is Runner default method");
	}

}
