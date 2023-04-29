package Stack_Class;

import java.util.Stack;

public class AddElementInStack {

	public static void main(String[] args) {

		Stack num = new Stack();
		// to add object to the stack
		System.out.println("Here we learn how to add object to the stack ====>");
		for (int i = 1; i <= 50; i++) {
			num.push(i);
		}
		System.out.println(num);
		System.out.println("Now we learn how to remove top most object from the stack ==>");
		System.out.println(" ");
		System.out.println("Remove top most object : " + num.pop());// remove and return.
		System.out.println(" ");
		System.out.println("Return top most element without removing");
		System.out.println(" ");
		System.out.println("Return top most element without removing : " + num.peek());
		System.out.println("Search the object is present or not : ");
		int src = num.search(1);
		System.out.println(src);
		System.out.println(num.empty());

	}

}
