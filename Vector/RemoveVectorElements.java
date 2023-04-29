package Vector_Interface;

import java.util.Vector;

public class RemoveVectorElements {

	public static void main(String[] args) {
		Vector countries = new Vector();
		countries.add("India");
		countries.add("America");
		countries.add("Russia");
		countries.add("China");
		countries.add("Indonesia");
		System.out.println(countries);
		String removedCountry = (String) countries.remove(2);
		System.out.println("The removed country is : " + removedCountry);
		countries.clear();
		System.out.println(countries);

	}

}
