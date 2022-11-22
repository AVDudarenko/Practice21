package homeTaskOne;

public class Main {
	public static void main(String[] args) {

		User user = new User();

		User sasha = new User("Sasha", 27, Sex.MALE);
		user.addPerson(sasha);
		User petya = new User("Petya", 26, Sex.MALE);
		user.addPerson(petya);
		User masha = new User("Masha", 25, Sex.FEMALE);
		user.addPerson(masha);
		User dasha = new User("Dasha", 24, Sex.FEMALE);
		user.addPerson(dasha);


		user.printAllPerson();

		System.out.println("All users MALE");
		User.getAllUsers(Sex.MALE).forEach(System.out::println);
		System.out.println("All users FEMALE");
		User.getAllUsers(Sex.FEMALE).forEach(System.out::println);
		System.out.println("================================================");
		System.out.println("Count of users: " + User.getHowManyUsers());
		System.out.println("All count of users MALE: " + User.getHowManyUsers(Sex.MALE));
		System.out.println("All count of users FEMALE: " + User.getHowManyUsers(Sex.FEMALE));
		System.out.println("================================================");
		System.out.println("Avg age of all users: " + User.getAllAgeUsers());
		System.out.println("Avg age of all MALE users: " + User.getAllAgeUsers(Sex.MALE));
		System.out.println("Avg age of all FEMALE users: " + User.getAllAgeUsers(Sex.FEMALE));
		System.out.println("================================================");
		System.out.println("Age of all users: " + User.getAverageAgeOfAllUsers());
		System.out.println("Age of all MALE: " + User.getAverageAgeOfAllUsers(Sex.MALE));
		System.out.println("Age of all FEMALE: " + User.getAverageAgeOfAllUsers(Sex.FEMALE));
		System.out.println("================================================");

	}
}
