package ListInterface;

import java.util.ArrayList;

public class AccessElementFromArrayList {

	public static void main(String[] args) {
		ArrayList<String> topCompanies = new ArrayList();

		System.out.println("Is topCompanies List empty : " + topCompanies.isEmpty());
		topCompanies.add("Google");
		topCompanies.add("Microsft");
		topCompanies.add("Appkle");
		topCompanies.add("Amazon");
		topCompanies.add("facebook");
		System.out.println("Is topCompanies List empty : " + topCompanies.isEmpty());
		System.out.println("list pf top companies is : " + topCompanies);

		System.out.println("Find size of give ArrayList : ");
		System.out.println("Size is : " + topCompanies.size());

		System.out.println("Retrieve the company : ");

		String bestCompany = topCompanies.get(0);
		String secondBestCompany = topCompanies.get(1);
		String lastCompany = topCompanies.get(topCompanies.size() - 1);

		System.out.println("The last company is : " + lastCompany);
		System.out.println("The best company is : " + bestCompany);
		System.out.println("The second best company is  : " + secondBestCompany);

		System.out.println("Now please modify the data : ");
		topCompanies.set(4, "Flipkart");
		System.out.println(topCompanies);

	}

}
