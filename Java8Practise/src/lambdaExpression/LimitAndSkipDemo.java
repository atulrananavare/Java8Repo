package lambdaExpression;

import java.util.Arrays;
import java.util.List;

public class LimitAndSkipDemo {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,28,87,10,28,76,80,80,80);
		
		//Print only first 2 numbers
		list.stream().limit(2).forEach(x->System.out.println("Limit----"+x));
		
		//Skip first 7 numbers/elements
		list.stream().skip(7).forEach(x->System.out.println(x));

	}

}
