package homeTaskOne;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private static final User user = new User();

    private static User userOne;
    private static User userTwo;
    private static User userThree;
    private static User userFour;
    private static User userFive;


    @BeforeAll
    public static void setUpUsersList() {
        userOne = new User("Sasha", 27, Sex.MALE);
        user.addPerson(userOne);
        userTwo = new User("Petya", 26, Sex.MALE);
        user.addPerson(userTwo);
        userThree = new User("Masha", 25, Sex.FEMALE);
        user.addPerson(userThree);
        userFour = new User("Dasha", 24, Sex.FEMALE);
        user.addPerson(userFour);
        userFive = new User("Misha", 17, Sex.MALE);
        user.addPerson(userFive);

    }

    @Test
    public void getAllUsers() {
        List<User> expected = User.getAllUsers();

        List<User> actual = new ArrayList<>();
        actual.add(userOne);
        actual.add(userTwo);
        actual.add(userThree);
        actual.add(userFour);
        actual.add(userFive);

        assertEquals(expected, actual);
    }

    @Test
    void getAllUsers_Male() {
        List<User> expected = User.getAllUsers(Sex.MALE);

        List<User> actual = new ArrayList<>();
        actual.add(userOne);
        actual.add(userTwo);
        actual.add(userFive);

        assertEquals(expected, actual);
    }

    @Test
    void getHowManyUsers() {
        int expected = User.getHowManyUsers();

        int actual = 5;

        assertEquals(expected, actual);
    }

    @Test
    void testGetHowManyUsers() {
    }

    @Test
    void getAllAgeUsers() {
    }

    @Test
    void testGetAllAgeUsers() {
    }

    @Test
    void getAverageAgeOfAllUsers() {
    }

    @Test
    void testGetAverageAgeOfAllUsers() {
    }
}