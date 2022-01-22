package lambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountTheNumberOfOccurenceOfNumbers {

	public static void main(String[] args) {
		
		
		String str="code decode code decode code decode demo";
		
		List<String> list=Arrays.asList(str.split(" "));
		
		Map<String, Long> map=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
		
		List<Character> chars=Arrays.asList('h','e','l','l','o','w','o','r','l','d');
	    Map<Character,Long> map1=chars.stream().map(c->c).
	    collect(Collectors.groupingBy(c->c,Collectors.counting()));
	    System.out.println(map1);
	}

}
