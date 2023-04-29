package HashSet_Interface;

import java.util.HashSet;
import java.util.Iterator;

public class RemoveAllElementFromHashSet {

	public static void main(String[] args) {

		HashSet<Integer> num = new HashSet<>();
		for (int i = 1; i <= 20; i++) {
			num.add(i);
		}
		System.out.println(num);

		Iterator itr = num.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		num.clear();
		System.out.println(num);
		Iterator itr1 = num.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

	}

}
