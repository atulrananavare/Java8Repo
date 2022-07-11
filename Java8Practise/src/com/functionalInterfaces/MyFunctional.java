package com.functionalInterfaces;

@FunctionalInterface
public interface MyFunctional {
	
	public abstract void myMethod(int a, int b);
	
	default void m1() {
		System.out.println("This is default method");
	}
	
	public static void m2() {
		System.out.println("This is static method");
	}

}
