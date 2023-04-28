package ListInterface;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteratorRemove {

	public static void main(String[] args) {

		ArrayList<Integer> num = new ArrayList<>();
		num.add(10);
		num.add(20);
		num.add(13);
		num.add(30);
		num.add(40);
		num.add(50);
		if (num.isEmpty() == false) {
			System.out.print("num is not empty");
		} else {
			System.out.println("num is empty");
		}
		System.out.println(" and  Size of num is : " + num.size());

		Iterator itr = num.iterator();
		while (itr.hasNext()) {
			Integer number = (Integer) itr.next();
			if (number % 2 != 0) {
				itr.remove();
			}
		}
		System.out.println(num);

	}

}
