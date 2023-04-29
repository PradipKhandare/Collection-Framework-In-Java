package HashSet_Interface;

import java.util.HashSet;

public class RetrieveObjectUsingForEachLoop {

	public static void main(String[] args) {
		HashSet el = new HashSet();
		el.add(1);
		el.add("Pradip");
		el.add('a');
		el.add("Khandare");
		System.out.println(el);
		for (Object items : el) {
			System.out.println(items);
		}

	}

}
