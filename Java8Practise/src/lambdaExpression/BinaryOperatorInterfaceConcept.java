package lambdaExpression;

import java.util.function.BinaryOperator;

public class BinaryOperatorInterfaceConcept {
	public static void main(String[] args) {
		BinaryOperator<Integer> ops=(x1,x2) -> x1+x2;
		
		int add=ops.apply(10, 20);
		
		System.out.println(add);
	}
}
