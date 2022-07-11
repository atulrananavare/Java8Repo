package com.functionalInterfaces;

public class Runner1 implements Left, Right {

	public static void main(String[] args) {
		
		Runner1 r=new Runner1();
		r.m1();

	}

	public void m1() {
		System.out.println("main m1 method");
	}

}
