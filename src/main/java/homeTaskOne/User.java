package homeTaskOne;

import java.util.*;

public class User {

    private int id;
    private String name;
    private int age;
    private Sex sex;

    private static final HashMap<Integer, User> users = new HashMap<>();

    private static int countForId = 0;

    public User(String name, int age, Sex sex) {
        //считаю, что добавлять логику в контруктор - bad practice. Присваивание id вынесено в метод.
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public User() {
    }

    public void addPerson(User person) {
        countForId++;
        this.id = countForId;
        users.put(id, person);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User person = (User) obj;
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

    public static int getHowManyUsers() {
        return users.size();
    }

    public static int getHowManyUsers(Sex sex) {
        return getAllUsers(sex).size();
    }

    public static List<User> getAllUsers(){
        return new ArrayList<>(users.values());
    }

    public static List<User> getAllUsers(Sex sex) {
        List<User> listAllUsers = new ArrayList<>();
        for (User user : users.values()) {
            if (user.sex == sex) {
                listAllUsers.add(user);
            }
        }
        return listAllUsers;
    }

    public static int getAllAgeUsers() {
        int countAge = 0;
        for (User person : users.values()) {
            countAge += person.age;
        }
        return countAge;
    }

    public static int getAllAgeUsers(Sex sex) {
        int countAge = 0;
        for (User person : getAllUsers(sex)) {
            countAge += person.age;
        }
        return countAge;
    }

    public static int getAverageAgeOfAllUsers() {
        return getAllAgeUsers() / getHowManyUsers();
    }

    public static int getAverageAgeOfAllUsers(Sex sex) {
        return getAllAgeUsers(sex) / getHowManyUsers(sex);
    }
}
