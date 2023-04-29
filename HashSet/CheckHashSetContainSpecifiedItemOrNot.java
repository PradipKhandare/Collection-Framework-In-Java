package HashSet_Interface;

import java.util.HashSet;

public class CheckHashSetContainSpecifiedItemOrNot {

	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet();
		for (int i = 1; i <= 10; i++) {
			numbers.add(i);
		}

		System.out.println(numbers);

		boolean check = numbers.contains(9);
		if (check == true) {
			System.out.println("Item is present");
		} else {
			System.out.println("Item is not present");
		}

	}

}
