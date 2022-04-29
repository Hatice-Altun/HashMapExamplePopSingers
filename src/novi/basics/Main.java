package novi.basics;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // HashMap Example: Pop Singers

        Map<Integer, String> persons = new HashMap<>();
        persons.put(1, "Jennifer Lopez");
        persons.put(2, "Ariana Grande");
        persons.put(3, "Lady Gaga");

        System.out.println("The winner this year is: " + persons.get(3));
        System.out.println("The winner last year was: " + persons.get(2));

        persons.put(7, "Madonna");
        System.out.println(persons.get(7) + " is watching");
        System.out.println("How many persons: " + persons.size());
        persons.remove(7);
        System.out.println("How many persons: " + persons.size());
        persons.clear();
        System.out.println("How many persons: " + persons.size());
    }
}
