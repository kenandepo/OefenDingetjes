package company.a.b.c.streams2.personkatas;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class UtilTest {

    @Test
    public void shouldMapStringsToUpperCase() {
        List<String> input = asList("This", "is", "java", "8");
        List<String> result = Util.mapToUppercase(input);
        assertEquals(List.of("THIS", "IS", "JAVA", "8"), result);
    }

    @Test
    public void shouldRemoveElementsWithMoreThanThreeCharacters() {
        List<String> input = asList("This", "is", "java", "8");
        List<String> result = Util.removeElementsWithMoreThanTreeCharacters(input);
        assertEquals(List.of("is", "8"), result);
    }

        @Test
        public void shouldSortStrings() throws Exception {
//            List<String> input = Arrays.asList("C", "F", "A", "D", "B", "E");
//            List<String> result = Util.sortStrings(input);
//            assertThat(result, is(equalTo(Arrays.asList("A", "B", "C", "D", "E", "F"))));
        }

    //    @Test
    //    public void shouldSortIntegers() throws Exception {
    //        List<String> input = Arrays.asList("2", "4", "12", "3");
    //        List<Integer> result = Util.sortIntegers(input);
    //        assertThat(result, is(equalTo(Arrays.asList(2, 3, 4, 12))));
    //    }
    //
    //    @Test
    //    public void shouldSortIntegersInDescendingOrder() throws Exception {
    //        List<String> input = Arrays.asList("2", "4", "12", "3");
    //        List<Integer> result = Util.sortIntegersDescending(input);
    //        assertThat(result, is(equalTo(Arrays.asList(12, 4, 3, 2))));
    //    }
    //
    //    @Test
    //    public void shouldSumIntegersInCollection() {
    //        List<Integer> input = asList(1, 2, 3, 4, 5);
    //        Integer result = Util.sum(input);
    //        assertThat(result, equalTo(1 + 2 + 3 + 4 + 5));
    //    }
    //
    //    @Test
    //    public void shouldFlattenCollectionToSingleCollection() {
    //        List<List<String>> input = asList(
    //                asList("Duke", "Fred"),
    //                asList("John", "George", "Paal"));
    //
    //        List<String> result = Util.flattenToSingleCollection(input);
    //        assertThat(result, contains("Duke", "Fred", "John", "George", "Paal"));
    //    }
    //
    //    @Test
    //    public void shouldSeparateNamesByComma() {
    //        List<Person> input = asList(
    //                new Person("Duke"),
    //                new Person("Fred"),
    //                new Person("John"));
    //
    //        String result = Util.separateNamesByComma(input);
    //        assertThat(result, equalTo("Names: Duke, Fred, John."));
    //    }
    //
    //    @Test
    //    public void shouldFindNameOfOldestPerson() {
    //        List<Person> input = asList(
    //                new Person("Duke", 10),
    //                new Person("Fred", 28),
    //                new Person("John", 45));
    //
    //        String result = Util.findNameOfOldestPerson(input);
    //        assertThat(result, equalTo("John"));
    //    }
    //
    //    @Test
    //    public void shouldFilterPeopleLessThan18YearsOld() {
    //        List<Person> input = asList(
    //                new Person("Duke", 10),
    //                new Person("Fred", 28),
    //                new Person("John", 45),
    //                new Person("Marius", 17));
    //
    //        List<String> result = Util.filterPeopleLessThan18YearsOld(input);
    //        assertThat(result, contains("Duke", "Marius"));
    //    }
    //
    //    @Test
    //    public void shouldRetrieveSummaryStatisticsForAge() {
    //        List<Person> input = asList(
    //                new Person("Duke", 10),
    //                new Person("Fred", 28),
    //                new Person("John", 45));
    //
    //        IntSummaryStatistics summaryStatistics = Util.getSummaryStatisticsForAge(input);
    //
    //        assertThat(summaryStatistics.getAverage(), equalTo((double) (10 + 28 + 45) / 3));
    //        assertThat(summaryStatistics.getSum(), equalTo((long) 10 + 28 + 45));
    //        assertThat(summaryStatistics.getMin(), equalTo(10));
    //        assertThat(summaryStatistics.getMax(), equalTo(45));
    //    }
    //
    //    @Test
    //    public void shouldPartitionAdults() {
    //        Person duke = new Person("Duke", 10);
    //        Person fred = new Person("Fred", 28);
    //        Person john = new Person("John", 45);
    //        List<Person> input = asList(duke, fred, john);
    //
    //        Map<Boolean, List<Person>> result = Util.partitionAdults(input);
    //
    //        assertThat(result.get(true), containsInAnyOrder(fred, john));
    //        assertThat(result.get(false), containsInAnyOrder(duke));
    //    }
    //
    //    @Test
    //    public void shouldPartitionByNationality() {
    //        Person duke = new Person("Duke", 10, "USA");
    //        Person fred = new Person("Fred", 28, "Norway");
    //        Person john = new Person("John", 45, "Norway");
    //        List<Person> input = asList(duke, fred, john);
    //
    //        Map<String, List<Person>> result = Util.partitionByNationality(input);
    //
    //        assertThat(result.get("USA"), containsInAnyOrder(duke));
    //        assertThat(result.get("Norway"), containsInAnyOrder(fred, john));
    //    }
}
