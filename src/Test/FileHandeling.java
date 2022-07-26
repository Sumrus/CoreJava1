package Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandeling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Order confirmation 1234567";
		
		FileOutputStream file;
		try {
			file = new FileOutputStream("result.txt");
			file.write(str.getBytes());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
