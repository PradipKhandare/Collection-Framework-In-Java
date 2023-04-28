package LinkedListPrograms;

import java.util.LinkedList;

public class CreateLinkedList {

	public static void main(String[] args) {
		LinkedList<String> animals = new LinkedList();
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Cat");
		animals.add(null);
		animals.add("Monkey");
		System.out.println(animals);
		animals.add(0, "Human");
		System.out.println(animals);

	}

}
