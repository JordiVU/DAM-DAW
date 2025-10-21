package streamsexample;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;

/**
 * Main program. It creates a list of Person objects and gets some final results using streams
 */

public class Main {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Nacho", 42));
        people.add(new Person("Juan", 70));
        people.add(new Person("Mario", 7));
        people.add(new Person("Laura", 4));
        people.add(new Person("Ana", 38));

        // Add here the code to print the names of adult people in the screen (one by line)
        people.stream().filter(p -> p.getAge() > 18)
                .map(p -> p.getName())
                .forEach(System.out :: println);
        System.out.println();

        // Add here the code to get a sublist of all the adult people
        List<Person> adultPeople = people.stream().filter(p -> p.getAge() > 18).toList();
        adultPeople.forEach(System.out::println);
        System.out.println();

        // Add here the code to sort the list by ages (ascending) and get a sublist of the 3 first elements
        List<Person> orderAge = people.stream().sorted((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()))
                .limit(3).toList();
        System.out.println();

        // Add here the code to get the names, separated by commas, of adult people
        String names = people.stream().filter(p -> p.getAge() > 18)
                .map(p -> p.getName())
                .collect(Collectors.joining(
                        ", "
                ));
        System.out.println(names);
        System.out.println();

        // Add here the code to get the sum of ages of the people in the list
        int age = people.stream().mapToInt(p -> p.getAge()).sum();
        System.out.println(age);
        System.out.println();

        // Add here the code to get the maximum age of the group
        OptionalInt ageMax = people.stream().mapToInt(p -> p.getAge()).max();
        System.out.println(ageMax.isPresent()? ageMax.getAsInt():0);
        System.out.println();

        // Add here the code to get the age average
        OptionalDouble ageAverage = people.stream().mapToInt(p -> p.getAge()).average();
        System.out.println(ageAverage.isPresent()? ageAverage.getAsDouble():0);
    }

}
