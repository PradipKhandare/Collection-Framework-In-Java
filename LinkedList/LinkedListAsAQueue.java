package LinkedListPrograms;

import java.util.LinkedList;

public class LinkedListAsAQueue {
//First In First Out
	public static void main(String[] args) {
		LinkedList queue = new LinkedList<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
	}

}
