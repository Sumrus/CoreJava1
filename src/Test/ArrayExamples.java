package Test;

public class ArrayExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num1 = {20,30,40,50};
		
		System.out.println("Total number of values are " + num1.length);
		System.out.println("Value at third postion is " + num1[num1.length - 1]);
		
		
		String[] name1 = {"abc", "def", "ghi"};
		System.out.println("Total number of values are " + name1.length);
		
		String name = "Clean India Green India";
		
		String[] arrWords = name.split(" ");
		System.out.println("Value at 3rd postion is " + arrWords[2]);
		System.out.println("Total number of values are " + arrWords.length);
		
		

	}

}
