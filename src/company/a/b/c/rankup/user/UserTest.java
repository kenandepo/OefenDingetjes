package company.a.b.c.rankup.user;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

// TODO: Replace examples and use TDD by writing your own tests

class UserTest {

    @Test
    void testSomething() {
        final Activities activities = new Activities();
        activities.setRank(100);

        final User user = new User(activities);
        assertEquals("expected", "actual");
    }
}
