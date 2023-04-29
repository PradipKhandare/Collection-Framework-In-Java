package HashSet_Interface;

import java.util.HashSet;

public class AddhashSetToAnotherHashSet {

	public static void main(String[] args) {

		HashSet laptop = new HashSet();
		laptop.add("Lenovo");
		laptop.add("Dell");
		laptop.add("Asus");
		laptop.add("HP");

		System.out.println(laptop);

		HashSet num = new HashSet();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		System.out.println(num);

		laptop.addAll(num);
		System.out.println(laptop);

	}

}
