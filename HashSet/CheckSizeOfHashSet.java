package HashSet_Interface;

import java.util.HashSet;

public class CheckSizeOfHashSet {

	public static void main(String[] args) {
		HashSet num = new HashSet();
		for (int i = 1; i <= 15; i++) {
			num.add(i);
		}
		System.out.println("\n elements which are present in num HashSet\n " + num);
		int size = num.size();
		System.out.println("The size of num HashSet is: " + size);
	}

}
