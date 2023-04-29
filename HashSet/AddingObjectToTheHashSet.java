package HashSet_Interface;

import java.util.HashSet;

public class AddingObjectToTheHashSet {

	public static void main(String[] args) {

		HashSet pl = new HashSet<>();
		pl.add("java");
		pl.add("Ruby");
		pl.add("Python");
		pl.add("java");
		System.out.println(pl);

	}

}
