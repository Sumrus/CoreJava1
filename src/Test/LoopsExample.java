package Test;

public class LoopsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//While Loop to print 1 to 10
		
//		int num1 = 1;
//		
//		while(num1<=10) {
//			
//			if(num1==5) {
//				num1 = num1+1;
//				continue;
//			}
//		
//		System.out.println(num1);
//		num1 = num1+1;
//		
//		}
		
		//For loop
		
		for(int count=1;count<=10;count++) {
			
			if(count==5) {
				continue; // to skip number
				//break;//to stop the loop
			}
			
			System.out.println(count);
		}
		
		// Array with loop
		
		int[] a = {20,30,40,50,60};
	
		for(int i=0;i<a.length;i++) {
			System.out.println("Value inside a " + a[i]);
		}
		
		//Another way 
		
		for(int value:a) {
			
			System.out.println(value);
		}
		
	}

}
