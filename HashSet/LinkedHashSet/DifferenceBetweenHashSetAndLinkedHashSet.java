package LinkedHashSet_Class;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class DifferenceBetweenHashSetAndLinkedHashSet {

	public static void main(String[] args) {

		HashSet num = new HashSet();
		for (int i = 1; i <= 10; i++) {
			num.add(i);
		}
		System.out.println("\n print the num Hashset \n => " + num);
		num.add("Pavan");
		num.add("Arati");

		Iterator itr = num.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());// insertion order is not preserved.
		}

		LinkedHashSet num1 = new LinkedHashSet();
		for (int i = 1; i <= 15; i++) {
			num1.add(i);
		}
		System.out.println("\n print the num1 LinkedHashset \n => " + num1);

		num1.add("Pradip");
		num1.add("Pradu");

		Iterator itr1 = num1.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());// insertion order is preserved
		}
	}

}
