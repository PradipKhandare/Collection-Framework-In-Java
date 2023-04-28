package ListInterface;

import java.util.ArrayList;

public class ArrayListFromAnotherCollection {

	public static void main(String[] args) {
		System.out.println("Create arraylist for first 5 prime number and add all the 5 in it");
		ArrayList firstFivePrimeNumbers = new ArrayList();
		firstFivePrimeNumbers.add(2);
		firstFivePrimeNumbers.add(3);
		firstFivePrimeNumbers.add(5);
		firstFivePrimeNumbers.add(7);
		firstFivePrimeNumbers.add(11);

		System.out.println(firstFivePrimeNumbers);
		System.out.println("Create arraylist for all 10 prime number and add firstFivePrimeNumber ArrayList in it");
		ArrayList firstTenPrimeNumbers = new ArrayList(firstFivePrimeNumbers);

		ArrayList nextFivePrimeNumbers = new ArrayList();
		nextFivePrimeNumbers.add(13);
		nextFivePrimeNumbers.add(17);
		nextFivePrimeNumbers.add(19);
		nextFivePrimeNumbers.add(23);
		nextFivePrimeNumbers.add(29);

		firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);

		System.out.println(firstTenPrimeNumbers);

	}

}
