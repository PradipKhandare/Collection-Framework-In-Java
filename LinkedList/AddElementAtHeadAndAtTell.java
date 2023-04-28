package LinkedListPrograms;

import java.util.LinkedList;

public class AddElementAtHeadAndAtTell {

	public static void main(String[] args) {

		LinkedList<String> stars = new LinkedList<>();
		stars.add("Virat");
		stars.add("Rohit");
		stars.add("Sachin");
		stars.add("Rushabh");
		stars.add("Ganguli");
		stars.add("Kapil Dev");

		System.out.println(stars);

		stars.addFirst("Dhawan");
		System.out.println(stars);
		stars.addLast("Hardik Pandya");
		System.out.println(stars);

	}

}
