package com.bifunctional;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BiFunctionalExample implements BiFunction<List<Integer>, List<Integer>, List<Integer>> {

	@Override
	public List<Integer> apply(List<Integer> list1, List<Integer> list2) {

		return Stream.of(list1, list2)
				.flatMap(List::stream)
				.distinct()
				.collect(Collectors.toList());

	}
	
	public static void main(String[] args) {
		BiFunctionalExample function=new BiFunctionalExample();
		
		List<Integer> list1=Stream.of(1,2,3,4).collect(Collectors.toList());
		List<Integer> list2=Stream.of(1,2,3,4,8,9,10).collect(Collectors.toList());
		
		System.out.println("Traditiona approach"+function.apply(list1, list2));
	
		
	}
	

}
