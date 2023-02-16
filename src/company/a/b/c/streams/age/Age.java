package company.a.b.c.streams.age;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Age {
    public static Set<String> getKidNames(List<Person> people) {
        return people.stream().filter(a -> a.getAge() < 18)
                .map(name -> name.getName())
                .collect(Collectors.toSet());
    }
}

