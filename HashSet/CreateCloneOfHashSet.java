package HashSet_Interface;

import java.util.HashSet;
import java.util.Iterator;

public class CreateCloneOfHashSet {

	public static void main(String[] args) {
		HashSet ch = new HashSet();
		ch.add('a');
		ch.add('b');
		ch.add('c');
		ch.add('d');
		ch.add('e');
		System.out.println(ch);
		HashSet clone = (HashSet) ch.clone();

		Iterator itr = ch.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		Iterator itr1 = clone.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}

}
