package lambdaExpression;

import java.util.function.Function;

public class SimpleLambda {

	public static void main(String[] args) {
		
		Interf I=(str)->System.out.println(str);
		I.abMethod(" Im from Abstract abMethod");

		
		Function<String, Integer> func= (x)-> x.length();
		int out=func.apply("Atul Rananavare");
		
		System.out.println(out);
		
		Function<Integer, Integer> func1= (x)-> x*10;
		
		int input=func.andThen(func1).apply("Atul Rananavare");
		
		System.out.println(input);
		
	}

}
