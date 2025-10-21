package Exercice4;
import java.awt.*;
import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.util.List;
import java.util.TreeMap; // Import the TreeMap class

public class Main {

    public static void main(String Args[]) {
        TreeSet<Person> personT = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare((int)o1.getEdad(), (int)o2.getEdad());
            }
        });
        TreeMap<Company, TreeSet<Person>> companyT = new TreeMap<>(new Comparator<Company>() {
            @Override
            public int compare(Company o1, Company o2) {
                return Double.compare(o1.getDinero(),o2.getDinero());
            }
        });

        personT.add(new Person("Julius", 28));
        personT.add(new Person("Jesus", 18));
        personT.add(new Person("Mama", 48));
        Company company1 = new Company("APPLE", 5.2);
        Company company2 = new Company("Samsung",10.2);
        Company company3 = new Company("Microsoft", 23);
        companyT.put(company1,personT);
        companyT.put(company2,personT);
        companyT.put(company3,personT);

        for(Company c: companyT.keySet()) {
            System.out.println(c.getNombre());
            for(Person p: companyT.get(c)) {
                System.out.println(" " + p.getNombre());
            }
        }
    }
}
