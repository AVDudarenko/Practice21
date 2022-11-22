package homeTaskOne;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Person person = new Person();

		Person sasha = new Person("Sasha", 27, "Male");
		person.addPerson(sasha);
		Person petya = new Person("Petya", 26, "Male");
		person.addPerson(petya);
		Person masha = new Person("Masha", 25, "Female");
		person.addPerson(masha);
		Person dasha = new Person("Dasha", 24, "Female");
		person.addPerson(dasha);


		person.printAllPerson();

	}
}
