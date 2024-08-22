package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {
    UserList userList = new UserList();

    @BeforeEach
    void init() {
        userList.addUser("adam", "1234");
        userList.addUser("dom", "4321");
        userList.addUser("john", "1234");
        userList.addUser("rock", "1234");
    }

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList

        // TODO: find one of them

        // TODO: assert that UserList found User
        // String expected = "<one of username>";
        // String actual = user.getUsername();
        // assertEquals(expected, actual);

        assertEquals("adam", userList.findUserByUsername("adam").getUsername());
        assertEquals("dom", userList.findUserByUsername("dom").getUsername());
        assertEquals("john", userList.findUserByUsername("john").getUsername());
        assertEquals("rock", userList.findUserByUsername("rock").getUsername());
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList

        // TODO: change password of one user

        // TODO: assert that user can change password
        // assertTrue(actual);

        assertTrue(userList.changePassword("adam", "1234", "2141"));
        assertTrue(userList.changePassword("john", "1234", "12345"));
        assertTrue(userList.changePassword("rock", "1234", "12345678"));

    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList

        // TODO: call login() with correct username and password

        // TODO: assert that User object is found
        // assertEquals(expected, actual);

        assertEquals("adam", userList.login("adam", "1234").getUsername());
        assertEquals("john", userList.login("john", "1234").getUsername());
        assertEquals("rock", userList.login("rock", "1234").getUsername());
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList

        // TODO: call login() with incorrect username or incorrect password

        // TODO: assert that the method return null
        // assertNull(actual);

        assertNotEquals("adamer", userList.login("adam", "1234").getUsername());
        assertNotEquals("johasdasn", userList.login("john", "1234").getUsername());
        assertNotEquals("roqweck", userList.login("rock", "1234").getUsername());
    }

}