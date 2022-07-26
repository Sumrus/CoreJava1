package Test;

public class ReversalExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//reverse String 
		
		String str1 = "Clean India Green India";
		
		String revStr1 = " ";
		
		for(int i=str1.length()-1;i>=0;i--) {
			
			revStr1 = revStr1 + str1.charAt(i);
		}
		
		System.out.println("Reversed String " + revStr1);
		
		
		//Number of vowels
		
		String str = str1.toLowerCase();
		int result = 0;
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				result++;
				
			}
			
		}
		System.out.println(result);
		
		//reversal of Array
		
		int[] array = {20,30,40,50,60};
		
		for(int i=array.length-1;i>=0;i--) {
			
			System.out.println(array[i]);
		}
		//reversal of number
		
		int num = 452356;
		
		int rev = 0;
		
		while(num>0) {
			
			int rem = num%10;
			rev = rev*10 + rem;
			num = num/10;
			
		}
		
		System.out.println(rev);
		
		

	}

}
