package HashSet_Interface;

import java.util.HashSet;

public class RemoveElementFromHashSetThatAreNotContainInAnotherHashSet {

	public static void main(String[] args) {
		HashSet mobiles = new HashSet();
		mobiles.add("iphone");
		mobiles.add("mi");
		mobiles.add("nokia");
		mobiles.add("samsung");

		System.out.println(mobiles);

		HashSet laptop = new HashSet();
		laptop.add("lanovo");
		laptop.add("hp");
		laptop.add("mi");
		laptop.add("samsung");

		System.out.println(laptop);
		if (mobiles.retainAll(laptop)) {
			System.out.println("\nRemoved itoms which are not in mobile\n");
		} else {
			System.out.println("unable to remove");
		}

		System.out.println(mobiles);
		System.out.println(laptop);

	}

}
