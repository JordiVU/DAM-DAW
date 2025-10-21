package lamdaexample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.*;

/**
 * Main program. It creates a list of Person objects and sorts it using different types of comparators
 */

public class Main {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Nacho", 42));
        people.add(new Person("Juan", 70));
        people.add(new Person("Mario", 7));
        people.add(new Person("Laura", 4));
        people.add(new Person("Ana", 38));

        // Add here the code to sort list by name (ascending order), using PersonComparator class
        Collections.sort(people, new PersonComparator());
        people.forEach(System.out :: println);
        System.out.println();

        // Add here the code to sort list by age (descending) using an anonymous class
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o2.getAge(), o1.getAge());
            }
        });
        people.forEach(System.out :: println);
        System.out.println();

        // Add here the code to sort list by age (ascending) using a lambda expression
        Collections.sort(people, (p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));
        people.forEach(System.out :: println);

    }
}