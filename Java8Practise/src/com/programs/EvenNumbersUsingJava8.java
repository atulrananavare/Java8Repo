package com.programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenNumbersUsingJava8 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32, 10, 15, 10, 15);

		list.stream().filter(a -> a % 2 == 0).forEach(x -> System.out.println(x));
		System.out.println("===============================");
		list.stream().filter(a -> !((a % 2) == 0)).forEach(x -> System.out.println(x));

		List<Integer> marks = list.stream().map(x -> x + 5).collect(Collectors.toList());

		System.out.println(marks);

		// duplicate find
		Set<Integer> set = new HashSet<>();
		Set<Integer> duplicate = list.stream().filter(x -> !set.add(x)).collect(Collectors.toSet());
		System.out.println(duplicate);
		System.out.println("===============================");
		// ascending order
		list.stream().sorted().collect(Collectors.toList()).forEach(x -> System.out.println(x));
		System.out.println("=========DESC=====================");
		// descending order
		// list.stream().sorted((o1,o2)->(o1<o2)?1:(o1>o2)?-1:0).collect(Collectors.toList()).forEach(x->System.out.println(x));

		list.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList())
				.forEach(x -> System.out.println(x));

		System.out.println("=========Min=====================");
		// descending order
		Integer min = list.stream().min((o1, o2) -> o1.compareTo(o2)).get();
		System.out.println(min);
		
		
		
	}

}
