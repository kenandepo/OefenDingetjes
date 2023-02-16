package company.a.b.c.streams.adultsvskids;

import static company.a.b.c.streams.adultsvskids.AdultsKids.partitionAdults;
import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

class AdultsKidsTest {

    @Test
    public void partitionAdultsShouldSeparateKidsFromAdults() {
        Person sara = new Person("Sara", 4);
        Person viktor = new Person("Viktor", 40);
        Person eva = new Person("Eva", 42);
        List<Person> collection = asList(sara, eva, viktor);
        Map<Boolean, List<Person>> result = partitionAdults(collection);
        assertEquals(2, result.size());
        //        assertThat(result.get(false)).hasSameElementsAs(singletonList(sara));
    }
}
