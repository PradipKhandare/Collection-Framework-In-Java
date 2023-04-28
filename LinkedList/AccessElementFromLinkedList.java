package LinkedListPrograms;

import java.util.LinkedList;

public class AccessElementFromLinkedList {

	public static void main(String[] args) {

		LinkedList<Integer> numbers = new LinkedList();
		numbers.add(1);
		numbers.add(2);
		numbers.add(5);
		numbers.add(1);
		System.out.println("Check it is empty or not : " + numbers.isEmpty());
		System.out.println("Check size : " + numbers.size());
		int num = numbers.get(numbers.size() - 1);
		System.out.println(num);
		System.out.println("The number present in index 1 is : " + numbers.get(1));

	}

}
