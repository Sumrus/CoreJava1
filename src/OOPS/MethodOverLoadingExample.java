package OOPS;

public class MethodOverLoadingExample {
	
	public void sum(int a, int b) {
		
		int result = a + b;
		System.out.println("Sum is " + result);
	}
	
public void sum(int a, int b, int c) {
		
		int result = a + b + c;
		System.out.println("Sum is " + result);
	}

}
