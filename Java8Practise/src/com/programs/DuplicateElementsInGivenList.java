package com.programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElementsInGivenList {

	public static void main(String[] args) {
		//Q1. How to find duplicate elements in a given integers list in java using Stream functions?
		
		List<Integer> list=Arrays.asList(10,15,8,49,25,98,98,32,15,111);
		
		HashSet<Integer> set=new HashSet<>();
		
		list.stream().filter(x->!set.add(x)).forEach(c->System.out.println(c));
		
		
		//Q2.Given a list of integers, find the total number of elements present in the list using Stream functions?
		
		List<Integer> list1=Arrays.asList(10,15,8,49,25,98,98,32,15);
		long count=list1.stream().count();
		System.out.println(count);
		
		//Q3.Given a list of integers, find the maximum value element present in it using Stream functions?
		
		Integer max=list.stream().max(Integer::compare).get();
		System.out.println("Max number is: "+max);

		List<String> strList=Arrays.asList("code","decode","code","dd","dhhdg","dd");
		HashSet<String> set2=new HashSet<>();
		Set<String> duplicate=strList.stream().filter(name->!set2.add(name)).collect(Collectors.toSet());
		System.out.println(duplicate);
	}
	
	

}
