package LinkedListPrograms;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListAtTheEndOfLinkedList {

	public static void main(String[] args) {

		LinkedList numbers = new LinkedList();
		numbers.add("one");
		numbers.add("Two");
		numbers.add("Three");
		numbers.add("Four");
		numbers.add("Five");
		System.out.println(numbers);

		ArrayList nextNumbers = new ArrayList<>();
		nextNumbers.add("Six");
		nextNumbers.add("Seven");
		nextNumbers.add("Eight");
		nextNumbers.add("Nine");
		nextNumbers.add("Ten");

		System.out.println(nextNumbers);

		numbers.addAll(nextNumbers);

		System.out.println(numbers);

	}

}
