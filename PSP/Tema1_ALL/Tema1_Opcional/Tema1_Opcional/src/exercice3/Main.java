package exercice3;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 22, Arrays.asList(10, 8, 9, 7)));
        students.add(new Student("Bob", 19, Arrays.asList(6, 7, 8, 7)));
        students.add(new Student("Charlie", 21, Arrays.asList(9, 10, 9, 8)));
        students.add(new Student("Diana", 20, Arrays.asList(5, 6, 6, 7)));
        students.add(new Student("Ethan", 23, Arrays.asList(8, 9, 7, 10)));

        //1. Sort the students by age in descending order and display their names.
        students.stream().sorted((a, b) -> Integer.compare(b.getAge(), a.getAge()))
                .map(Student::getName)
                .forEach(System.out::println);
        System.out.println();

        //2. Calculate the average grade of all students and print the result.
        students.stream()
                .flatMap(s -> s.getGrades().stream())
                .mapToDouble(Integer::doubleValue)
                .average()
                .ifPresent(System.out::println);
        System.out.println();

        //3. Find the student with the highest average grade and display their name.
        // No idea

        //4. Print the names of students who are older than 20.
        students.stream().filter(a -> a.getAge() > 20)
                .map(Student::getName)
                .forEach(System.out::println);
        System.out.println();

        //5. Create a map where the key is the student's name and the value is their average grade.
        Map<String, Double> studentsAvarage =
                students.stream()
                        .collect(Collectors.toMap(Student::getName,
                                s -> s.getGrades().stream().
                                        mapToDouble(Integer::doubleValue)
                                        .average()
                                        .orElse(0.0)));
        studentsAvarage.forEach((name, note) ->
                System.out.println(name + " - " + note));






    }
}
