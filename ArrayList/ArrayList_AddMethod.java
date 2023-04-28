package ListInterface;

import java.util.ArrayList;

public class ArrayList_AddMethod {

	public static void main(String[] args) {
		ArrayList prod = new ArrayList();
		prod.add("Sugar");
		prod.add("Tea");
		prod.add("pen");
		prod.add("Rubber");
		prod.add('a');

		System.out.println(prod);

		prod.add(0, "List Started for here");
		System.out.println(prod);

	}

}
