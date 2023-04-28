package LinkedListPrograms;

import java.util.LinkedList;

public class RemoveElementFromLinkedList {

	public static void main(String[] args) {
		LinkedList cars = new LinkedList<>();
		cars.add("Swift");
		cars.add("Ferrari");
		cars.add("BMW");
		cars.add("Jaguar");
		cars.add("Fortuner");
		cars.add("Thar");
		System.out.println(cars);
		String removedElement = (String) cars.remove(1);
		System.out.println(removedElement);
		System.out.println(cars);
	}

}
