package com.functionalInterfaces;

public interface Left {
	
	default void m1() {
		System.out.println("Left interface Method");
	}

	public static void main(String[] args) {
		System.out.println("Interface main method");
	}
}
