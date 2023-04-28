package LinkedListPrograms;

import java.util.LinkedList;

public class AddCollectionOnSpecificLocation {

	public static void main(String[] args) {
		LinkedList ch = new LinkedList<>();
		ch.add('a');
		ch.add('b');
		ch.add('h');
		ch.add('i');
		System.out.println(ch);

		LinkedList ch2 = new LinkedList<>();
		ch2.add('c');
		ch2.add('d');
		ch2.add('e');
		ch2.add('f');
		ch2.add('g');

		System.out.println(ch2);

		ch.addAll(2, ch2);
		System.out.println("After adding ch2 on index 2 : " + ch);

	}

}
