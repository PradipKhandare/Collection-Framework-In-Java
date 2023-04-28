package ListInterface;

import java.util.ArrayList;

public class ArrayListUserDefinedObject {

	public static void main(String[] args) {
		ArrayList users = new ArrayList();
		users.add(new User("Pradip", 25));
		users.add(new User("Akshay", 23));
		users.add(new User("Shubham", 22));

		users.forEach(user -> {
			System.out.println("Name : " + ((User) user).getName() + " Age : " + ((User) user).getAge());
		});

	}

}
