package lambdaExpression;

public class Test  {

	public static void main(String[] args) {
		
		
		addable add= (a,b)-> System.out.println(a+b);
		add.add(5, 8);
		
		multiplicable multi=(a,b)-> System.out.println(a*b);
		multi.multi(5, 8);
		
		
	}

	

}
