package company.a.b.c.streams2.personkatas;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;

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
        return null;
    }

    public static List<Integer> sortIntegers(List<String> input) {
        return null;
    }

    public static List<Integer> sortIntegersDescending(List<String> input) {
        return null;
    }

    public static Integer sum(List<Integer> numbers) {
        return null;
    }

    public static List<String> flattenToSingleCollection(List<List<String>> input) {
        return null;
    }

    public static String separateNamesByComma(List<Person> input) {
        return null;
    }

    public static String findNameOfOldestPerson(List<Person> input) {
        return null;
    }

    public static List<String> filterPeopleLessThan18YearsOld(List<Person> input) {
        return null;
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
