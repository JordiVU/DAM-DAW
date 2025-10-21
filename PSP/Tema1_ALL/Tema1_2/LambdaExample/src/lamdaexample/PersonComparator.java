package lamdaexample;

import java.util.*;

/**
 * This class implements Comparator interface using a "traditional" class to sort persons by
 * name (alphabetically) in ascending order
 */

public class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }
}
