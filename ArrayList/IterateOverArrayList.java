package ListInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterateOverArrayList {

	public static void main(String[] args) {
		ArrayList movies = new ArrayList();
		movies.add("Dada");
		movies.add("Pathan");
		movies.add("Ved");
		movies.add("Housefull");
		movies.add("Krish");
		movies.add("Commando");

		System.out.println("Is movies empty? " + movies.isEmpty());
		System.out.println("Check size of movies : " + movies.size());
		System.out.println("*************Iterate using java 8 forEach and Lambda**************");

		movies.forEach(movie -> {
			System.out.println(movie);
		});

		System.out.println(movies);

		System.out.println("*************Iterate using Iterator()**************");
		Iterator itr = movies.iterator();
		while (itr.hasNext()) {
			String movieList = (String) itr.next();
			System.out.println(movieList);
		}

		System.out.println("*************Iterate using Iterator() and forEachRemaining() method**************");
		itr = movies.iterator();
		itr.forEachRemaining(movie -> {
			System.out.println(movie);
		});

		System.out.println("*************Iterate using ListIterator() to traverse in both directions**************");
		ListIterator<String> litr = movies.listIterator(movies.size());
		while (litr.hasPrevious()) {
			String movie = litr.previous();
			System.out.println(movie);
		}

		while (litr.hasNext()) {
			String movie = litr.next();
			System.out.println(movie);
		}

		System.out.println("*************Iterate using forEach loop**************");
		for (Object movie : movies) {
			System.out.println(movie);
		}

		System.out.println("*************Iterate using loop with index)**************");
		for (int i = 0; i < movies.size(); i++) {
			System.out.println(movies.get(i));
		}
	}

}
