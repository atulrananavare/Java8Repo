package com.functionalInterfaces;

@FunctionalInterface
public interface MyFunctionalInterface {

	public abstract void SingleAbstractMethod();
	
	default void m1() {
		System.out.println("My default method");
	}
	
	static void m2() {
		System.out.println("My static method");
	}
	
}
