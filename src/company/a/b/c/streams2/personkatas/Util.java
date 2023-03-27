package company.a.b.c.streams2.personkatas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.IntStream;

public class Util {

    public static List<String> mapToUppercase(List<String> input) {
        return input.stream()
                .map(request -> request.toUpperCase())
                .toList();
    }

    public static List<String> removeElementsWithMoreThanTreeCharacters(List<String> input) {
        return input.stream()
                .filter(i -> i.length() < 3)
                .toList();
    }

    public static List<String> sortStrings(List<String> input) {
        return input.stream()
                .sorted()
                .toList();
    }

    public static List<Integer> sortIntegers(List<String> input) {
        return input.stream()
                .map(Integer::valueOf)
                .sorted()
                .toList();
    }

    public static List<Integer> sortIntegersDescending(List<String> input) {
        return input.stream()
                .map(Integer::valueOf)
                .sorted(Comparator.reverseOrder())
                .toList();
    }

    public static Integer sum(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, (a, b) -> a + b);
    }

    public static List<String> flattenToSingleCollection(List<List<String>> input) {
        return input.stream()
                .flatMap(List::stream)
                .toList();
    }

    public static String separateNamesByComma(List<Person> input) {
        return null;
    }

    public static String findNameOfOldestPerson(List<Person> input) {
        return input.stream()
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getName)
                .get();
    }

    public static List<String> filterPeopleLessThan18YearsOld(List<Person> input) {
        return input.stream()
                .filter(person -> person.getAge() < 19)
                .map(p -> p.getName())
                .toList();

    }

    public static IntSummaryStatistics getSummaryStatisticsForAge(List<Person> input) {
        return null;
    }

    public static Map<Boolean, List<Person>> partitionAdults(List<Person> input) {
        return null;
    }

    public static Map<String, List<Person>> partitionByNationality(List<Person> input) {
        return null;
    }
}
