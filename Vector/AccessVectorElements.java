package Vector_Interface;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class AccessVectorElements {

	public static void main(String[] args) {
		Vector<Integer> num = new Vector<>();
		for (int i = 1; i <= 10; i++) {
			num.add(i);
		}
		System.out.println(num);
		int number = num.get(4);
		System.out.println("The number present on index 4 is : " + number);

		Iterator itr = num.iterator();
		System.out.println("Print all the number present in Vector one by one : ");
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
		System.out.println("if you want to present your element in both direction go for \"ListIterator\" ");

		ListIterator litr = num.listIterator(num.size());
		while (litr.hasPrevious()) {
			int obj = (int) litr.previous();
			System.out.println(obj);
		}
	}

}
