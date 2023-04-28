package LinkedListPrograms;

import java.util.LinkedList;
import java.util.ListIterator;

public class TraverseLinkedListInReverseDirection {

	public static void main(String[] args) {
		LinkedList numbers = new LinkedList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.add(10);
		numbers.add(11);
		System.out.println(numbers);

		ListIterator<Integer> litr = numbers.listIterator(numbers.size());

		while (litr.hasPrevious()) {
			Integer num = litr.previous();
			System.out.println(num);
		}

	}

}
