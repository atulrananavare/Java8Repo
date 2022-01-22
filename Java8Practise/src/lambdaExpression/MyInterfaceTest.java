package lambdaExpression;

import java.util.function.Predicate;

import com.functionalInterfaces.MyFunctionalInterface;

public class MyInterfaceTest {

	public static void main(String[] args) {
	
		/*MyFunctionalInterface interf=(a,b)->System.out.println(a*b);
		interf.SingleAbstractMethod(10, 12);*/
		
		
		MyFunctionalInterface interf2=Tester :: testImplementation;
		interf2.SingleAbstractMethod();
		
		Predicate<Integer> checknumber=a->a.intValue()>=5 ;
		System.out.println(checknumber.test(2));
	}

}

class Tester{
	
	public static void testImplementation() {
		System.out.println("This is test implementation of your abstract method");
	}
}
