package LinkedListPrograms;

import java.util.LinkedList;

public class RemoveElementFromBothEnd {

	public static void main(String[] args) {
		LinkedList cities = new LinkedList<>();
		cities.add("Mumbai");
		cities.add("Delhi");
		cities.add("Pune");
		cities.add("Nagpur");
		cities.add("Satara");
		cities.add("Sangli");
		cities.add("Kolhapur");

		System.out.println("All cities  are : " + cities);
		cities.removeFirst();
		System.out.println("After removing first city : " + cities);
		cities.removeLast();
		System.out.println("After removing last city : " + cities);

	}

}
