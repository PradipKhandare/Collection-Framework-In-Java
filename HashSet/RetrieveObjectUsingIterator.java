package HashSet_Interface;

import java.util.HashSet;
import java.util.Iterator;

public class RetrieveObjectUsingIterator {

	public static void main(String[] args) {

		HashSet name = new HashSet();
		name.add("Pradip");
		name.add("Rahul");
		name.add("Sandip");
		name.add("Karan");
		name.add("Om");
		Iterator itr = name.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
