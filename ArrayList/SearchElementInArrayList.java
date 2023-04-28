package ListInterface;

import java.util.ArrayList;

public class SearchElementInArrayList {

	public static void main(String[] args) {
		ArrayList names = new ArrayList();

		names.add("Pradip");
		names.add("Om");
		names.add("Shubham");
		names.add("Akshay");
		names.add("Sushil");
		names.add("Tukaram");
		names.add("Kunal");
		names.add("Akshay");
		names.add("Balaji");
		System.out.println("Size of names object is : " + names.size());

		System.out.println("Is there any \"Kunal\" is present : " + names.contains("Kunal"));
		System.out.println("What is the index of \"Balaji\" : " + names.indexOf("Balaji"));
		System.out.println("What is the index of \"Sushil\" : " + names.indexOf("Sushil"));
		System.out.println("What is the last index of \"Akshay\" : " + names.lastIndexOf("Akshay"));// 7
		System.out.println("What is the last index of \"Tuks\" : " + names.lastIndexOf("Tuks"));// not in list
	}

}
