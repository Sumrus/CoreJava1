package Test;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       int num = 10;
		
		try {
			
		int result = num/0;
		
		System.out.println(result);
		
		} catch(Exception e) {
			
			System.out.println("Inside the Catch block");
		}
	
		System.out.println("After the Catch Block");

	}

}
