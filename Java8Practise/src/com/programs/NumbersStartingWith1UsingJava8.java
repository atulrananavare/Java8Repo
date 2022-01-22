package com.programs;

import java.util.Arrays;
import java.util.List;

public class NumbersStartingWith1UsingJava8 {

	public static void main(String[] args) {
		//Given a list of integers, find out all the numbers starting with 1 using Stream functions?
		List<Integer> list=Arrays.asList(10,15,8,49,25,98,32);
		
		list.stream().map(s->s+"").filter(x->x.startsWith("1")).forEach(System.out::println);

	}

}
