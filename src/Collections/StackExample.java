package Collections;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Syntax
		
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(4);
		stack.push(5);
		stack.push(6);
		
		System.out.println(stack);
		
		stack.pop();
		
		System.out.println(stack);
		
		stack.push(7);
		
		System.out.println(stack);

	}

}
