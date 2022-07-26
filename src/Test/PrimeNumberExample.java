package Test;

import java.util.Scanner;

public class PrimeNumberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter any number ");
		
		int num = scanner.nextInt();
		
		boolean flag = true;
		
		for(int i = 2;i<num/2;i++) {
			int remainder = num%i;
			
			if(remainder==0) {
				
				flag = false;
				break;
				
			}					
		}
		if(flag==true) {
			
			System.out.println("The number is Prime");
		}
		else {
			System.out.println("The number is not Prime");
		}
		
		scanner.close();
	

	}

}
