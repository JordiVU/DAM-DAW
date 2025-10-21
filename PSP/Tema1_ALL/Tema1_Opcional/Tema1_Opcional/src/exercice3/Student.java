package exercice3;

import java.util.List;

public class Student {
    private String name;
    private int age;
    private List<Integer> grades;

    public Student(String name, int age, List<Integer> grades) {
        this.name = name;
        this.age = age;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return name + " | " + age + " | " + grades;
    }
}
