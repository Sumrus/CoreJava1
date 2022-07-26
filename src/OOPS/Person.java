package OOPS;

public class Person {
	
	String Name;
	int Age;
	
	public Person() {
		
	}
	 
	public Person(String Name, int Age) {
		
		this.Name = Name;
		this.Age = Age;
	}
	
	public void display() {
		
		System.out.println(this.Name);
	}

}
