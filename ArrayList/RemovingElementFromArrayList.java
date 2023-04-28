package ListInterface;

import java.util.ArrayList;

public class RemovingElementFromArrayList {

	public static void main(String[] args) {
		ArrayList programingLanguages = new ArrayList();
		programingLanguages.add("JAVA");
		programingLanguages.add("Python");
		programingLanguages.add("Golang");
		programingLanguages.add("C");
		programingLanguages.add("C++");
		programingLanguages.add("Perl");
		programingLanguages.add("Ruby");
		System.out.println("Is programingLanguages empty? " + programingLanguages.isEmpty());
		System.out.println("Size of programingLanguages is? " + programingLanguages.size());
		programingLanguages.remove(4);
		System.out.println("Size of programingLanguages after removing 4 is : " + programingLanguages.size());
		boolean isRemoved = programingLanguages.remove("sql");
		System.out.println(isRemoved);
		System.out.println("after removing(\"sql\") : " + programingLanguages);

		ArrayList scriptingLanguages = new ArrayList();
		scriptingLanguages.add("Python");
		scriptingLanguages.add("Ruby");
		scriptingLanguages.add("Perl");

		programingLanguages.removeAll(scriptingLanguages);

		System.out.println("After \"removeAll\" : " + programingLanguages);

//		programingLanguages.removeIf(new Predicate<String>() {
//			@Override
//			public boolean test(String s) {
//				return s.startsWith("C");
//			}
//		});

//		System.out.println("Using lambda expression : ");
//		programingLanguages.removeIf(s -> ((String) s).startsWith("c"));

		System.out.println("After removing all elements starts with \"c\" : " + programingLanguages);

		programingLanguages.clear();
		System.out.println("After using \"Clear()\" : " + programingLanguages);
	}

}
