package Test;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Clean World Green World";
		
		String str1 = str.toLowerCase();
		
		int count = 0;
		
		for(int i=0;i<str1.length();i++) {
			
			char temp = str1.charAt(i);
			
			switch(temp) {
			case 'a': case 'e': case 'i': case 'o': case 'u':
				count++;
				break;
				
			default:
				System.out.println("No vowles");
				
			}
		}
		
		System.out.println(count);

	}

}
