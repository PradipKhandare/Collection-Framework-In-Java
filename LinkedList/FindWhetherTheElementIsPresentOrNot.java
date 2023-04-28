package LinkedListPrograms;

import java.util.LinkedList;

public class FindWhetherTheElementIsPresentOrNot {

	public static void main(String[] args) {
		LinkedList companies = new LinkedList<>();
		companies.add("TCS");
		companies.add("Infosys");
		companies.add("Servion");
		companies.add("Accenture");
		companies.add("Wipro");
		companies.add("Cognizant");
		System.out.println(companies);

		String company = "Apple";
		boolean contains = companies.contains(company);
		if (contains == true) {
			System.out.println("it is present and index number is : " + companies.indexOf(company));
		} else {
			System.out.println("Not present in list man");
		}

	}

}
