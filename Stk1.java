package suchitra_java;

import java.util.Stack;

public class Stk1 {
     public static void main(String[] args) {
		Stack s=new Stack();
		s.push(10);s.push(20);s.push(30);s.push(40);s.push(50);s.push(60);s.push(70);s.push(10);
		System.out.println(s);
		System.out.println(s.pop());  //remove item from stack
		System.out.println(s);
		System.out.println(s.peek()); //detect last item in stack but dont delete
		System.out.println(s);
		
		System.out.println(s.search(20)); //display index start from 1
		System.out.println(s.search(200)); //display -1 if not there
		


		
		

		

	}
}
