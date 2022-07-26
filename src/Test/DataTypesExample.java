package Test;

public class DataTypesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 20;
		int num2 = 30;
		
		int sum = num1 + num2;
		int sub = num2 - num1;
		int mul = num1*num2;
		float div = (float) num2/num1;
		
		String result = "The sum of two number is " + sum;
		String result1 = "The sub of two number is " + sub;
		String result2 = "The multiplication of two number is " + mul;
		String result3 = "The division of two number is " + div;
		
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		String name = "Clean India Green India";
		
		System.out.println("Toatal number of chars are " + name.length());
		
		char char1 = name.charAt(0);
		System.out.println("Char at first place is " + char1);
		
		System.out.println("The string in uppercase " + name.toUpperCase());
		System.out.println("The string in lowercase " + name.toLowerCase());

	}

}
