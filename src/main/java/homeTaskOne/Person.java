package homeTaskOne;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Person {

	private int id;
	private String name;
	private int age;
	private String sex;

	private static HashMap<Integer, Person> users = new HashMap<>();

	private static int countForId = 0;

	public Person(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public Person() {

	}

	public void addPerson(Person person) {
		countForId++;
		this.id = countForId;
		users.put(id, person);
	}

//	public boolean isHasUser(Person person) {
//
////		for (Map.Entry<Integer, Person> entry : users.entrySet()) {
////			Integer key = entry.getKey();
////			Person value = entry.getValue();
////			if (value.equals(this) && (value.hashCode() == this.hashCode())) {
////				continue;
////			}
////		}
////
////		for (person : users.values()) {
////			if (person.equals(this) && (person.hashCode() == this.hashCode())) {
////				return true;
////			}
////		}
////		return false;
//	}


	@Override
	public int hashCode() {
		return Objects.hash(name, age, sex);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Person person = (Person) obj;
		return age == person.age &&
				Objects.equals(name, person.name) &&
				Objects.equals(sex, person.sex);
	}

	@Override
	public String toString() {
		return "Person{" +
				"id=" + id +
				", name='" + name + '\'' +
				", age=" + age +
				", sex=" + sex +
				'}' + "\n";
	}

	public void printAllPerson() {

		System.out.println(users);

	}
}
