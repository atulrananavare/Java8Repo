package lambdaExpression;
@FunctionalInterface
public interface addable {

	public void add(int a,int b);
	
	default void  m1() {
		System.out.println("this is default method from addable");
	}
	
	
	default int m2() {
		return 0;
	}
}
