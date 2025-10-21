package exercice1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jordi", "RREE", 500000));
        employeeList.add(new Employee("María", "Engineering", 20000));
        employeeList.add(new Employee("Jorge", "Marketing", 11920));
        employeeList.add(new Employee("Santi", "Marketing", 12000));
        employeeList.add(new Employee("Mireya", "Engineering", 12400));
        employeeList.add(new Employee("Sofía", "HR", 300400));

        // 1. Sort the employees by salary in ascending order using a lambda expression, and show the result in
        //the console
        employeeList.stream()
                .sorted((a, b) -> Double.compare(a.getSalary(), b.getSalary()))
                .forEach(System.out::println);

        System.out.println();

        //2. Get all the employees whose salary is greater than $50,000. Store the result in a list and display it
        //in the console.
        List<Employee> employeesTop = employeeList.stream()
                .filter(a -> a.getSalary() > 50000)
                .sorted((a, b) -> Double.compare(b.getSalary(), a.getSalary()))
                .toList();
        employeesTop.forEach(System.out::println);

        System.out.println();
        //3. Find the employee with the highest salary and display their name
        employeeList.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .ifPresent(a -> System.out.println(a.toString()));

        System.out.println();
        //4. Print the names of all employees in the "Engineering" department, separated by commas
        String employeeEnginers = employeeList.stream()
                .filter(a -> a.getDepartment().equals("Engineering"))
                .map(Employee::getName)
                .collect(Collectors.joining(","));

        System.out.println(employeeEnginers);

        System.out.println();
        //5. Calculate the average salary of employees in the "Marketing" department and print the result.
        employeeList.stream()
                .filter(a -> a.getDepartment().equals("Marketing"))
                .mapToDouble(Employee::getSalary)
                .average()
                .ifPresent(System.out::println);

    }
}