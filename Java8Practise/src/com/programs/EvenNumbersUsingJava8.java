package com.programs;

import java.util.Arrays;
import java.util.List;

public class EvenNumbersUsingJava8 {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(10,15,8,49,25,98,32);
		
		list.stream().filter(a->a%2==0).forEach(x->System.out.println(x));
		

	}

}
