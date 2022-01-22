package lambdaExpression;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicateUsingJava8 {

	public static void main(String[] args) {
		//Find the duplicate elements in the given array integer using java 8
		List<Integer> list=Arrays.asList(10,28,87,10,28,76,80,80,80);
		
		/*BiConsumer<Integer, Integer> sum=(a,b)->System.out.println(a*b);
		sum.accept(10, 12);
		*/

		/*list.stream().filter(x -> x%2==0).forEach(x->System.out.println("Filter----"+x));
		list.stream().map(x -> x+5).forEach(x->System.out.println("Map-----"+x));
		*/
		
		//list.stream().distinct().forEach(y->System.out.println(y));
		Set<Integer> set= new HashSet<>();
		
		
		list.stream().filter(x->!set.add(x)).distinct().collect(Collectors.toList()).forEach(y->System.out.println(y));
		
		//list.stream().sorted().forEach(z->System.out.println(z));
		
		/*list.stream().sorted((i1,i2)->i2.compareTo(i1)).forEach(z->System.out.println(z));
		
		
		Integer min=list.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Min value is:----"+min);
		
		Integer max=list.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Max value is:----"+max);*/
		
		//Stream.of(1,111,1111).forEach(z->System.out.println(z));
		
		//String[] names= {"Code","Decode","Demo"};
		//Stream.of(names).filter(x->x.length()>4).forEach(y->System.out.println(y));
	
	}

}
