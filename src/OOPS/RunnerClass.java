package OOPS;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Without Constructor*/
		
//		Employee emp1 = new Employee();
//		emp1.Name = "Sumit";
//		emp1.EmployeeId = 23456;
//		emp1.Salary = 3000;
//		
//		Employee emp2 = new Employee();
//		emp2.Name = "Tara";
//		emp2.EmployeeId = 12345;
//		emp2.Salary = 4000;
		
//		System.out.println("Name of emp1 " + emp1.Name);
//		System.out.println("Name of emp2 " + emp2.Name);
		
		/* Using Constructor*/
		
		Employee emp1 = new Employee("Sumit", 23456, 3000);
		Employee emp2 = new Employee("Tara", 123456, 4000);
		Employee emp3 = new Employee();
		
		emp1.PrintName();
		emp2.PrintName();
		System.out.println("Name of emp3 " + emp3.Name);
		
		
		// Example of Inheritance.....Person is parent class for ChildClass
		
		Person per1 = new Person ("Adarsh", 28);
		
		per1.display();
		
		ChildClass child1 = new ChildClass("Ankit", 30, "FoodLover");
		child1.display();
		child1.print();
		
		
		/*Example of Polymorphism are Overriding and Overloading
		overloading is same name with different parameter in same class and 
		overriding is same name, same parameter but in different class*/
		
		MethodOverLoadingExample obj = new MethodOverLoadingExample();
		obj.sum(4, 6);
		obj.sum(4, 5, 6);
		
		
		/* Encapsulation Example */
		
		EncapsulationExample obj2 = new EncapsulationExample();
		
		obj2.setName("Sumit");
		
		System.out.println(obj2.getName());

	}

}
