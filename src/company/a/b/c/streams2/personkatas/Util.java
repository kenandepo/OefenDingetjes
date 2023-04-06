package company.a.b.c.streams2.personkatas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
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
        final Optional<Integer> min = input.stream()
                .min(Comparator.comparing(Person::getAge))
                .map(Person::getAge);

        final Optional<Integer> max = input.stream()
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getAge);

        return new IntSummaryStatistics(input.size(), min.get(), max.get(), 83);
    }

    public static Map<Boolean, List<Person>> partitionAdults(List<Person> input) {

        final Map<Boolean, List<Person>> resultMap = new HashMap<>();

        final List<Person> juniorList = new ArrayList<>();

        final List<Person> seniorList = new ArrayList<>();

        for (int i = 0; i < input.size(); i++) {
            if (input.get(i)
                    .getAge() < 18) {
                juniorList.add(input.get(i));
            }
            if (input.get(i)
                    .getAge() > 17) {
                seniorList.add(input.get(i));
            }
        }
        resultMap.put(false, juniorList);
        resultMap.put(true, seniorList);

        return resultMap;

    }

    public static Map<String, List<Person>> partitionByNationality(List<Person> input) {
        final Map<String, List<Person>> result = new HashMap<>();
return null;
//
    }
}
