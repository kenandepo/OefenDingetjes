package company.a.b.c.streams.age;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

class AgeTest {

    @Test
    public void getKidNameShouldReturnNamesOfAllKidsUnder18() {
        Person sara = new Person("Sara", 4);
        Person marin = new Person("Marin", 13);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        Person anna = new Person("Anna", 5);
        Person loek = new Person("Loek", 10);
        List<Person> collection = asList(sara, eva, viktor, anna, marin, loek);
        final Set<String> kidNames = Age.getKidNames(collection);
        assertEquals(4, kidNames.size());
    }
}
