package LinkedListPrograms;

import java.util.LinkedList;

public class ChangeElementOfLinkedList {

	public static void main(String[] args) {

		LinkedList programinglanguages = new LinkedList<>();
		programinglanguages.add("Java");
		programinglanguages.add("Python");
		programinglanguages.add("Ruby");
		programinglanguages.add("Golang");
		programinglanguages.add("Perl");

		System.out.println(programinglanguages);
		programinglanguages.set(3, "SQL");
		System.out.println(programinglanguages);

	}

}
