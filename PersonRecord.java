
import java.util.*;
import java.util.stream.Collectors;

record Person(String name, int age) {}

public class PersonRecord {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Alice", 25),
            new Person("Bob", 17),
            new Person("Carol", 30)
        );

        people.stream()
              .filter(p -> p.age() >= 18)
              .forEach(System.out::println);
    }
}
