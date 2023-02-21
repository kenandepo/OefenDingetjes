package company.a.b.c.streams.adultsvskids;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AdultsKids {

    //todo refactor to use Stream
//    public static Map<Boolean, List<Person>> partitionAdults(List<Person> people) {
//        Map<Boolean, List<Person>> hashMap = new HashMap<>();
//        hashMap.put(true, new ArrayList<>());
//        hashMap.put(false, new ArrayList<>());
//
//        return people.stream().filter(p -> p.getAge() >= 18).map(p -> hashMap.put(true, new HashMap<Boolean,>(p))).collect(Collectors.toList()); for (Person person : people) {
//            hashMap.get(person.getAge() >= 18).add(person);
//        }
//
//        return hashMap;
//    }
}
