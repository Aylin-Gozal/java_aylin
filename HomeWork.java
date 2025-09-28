package Collection;

import java.util.*;

public class HomeWork {
    public static void main(String[] args) {
        // Task one
        HashSet<String> cities = new HashSet<>();
        cities.add("Baku");
        cities.add("Rome");
        cities.add("Barcelona");
        cities.add("Stockholm");
        cities.add("Baku");
        System.out.println(cities);

        // Task two
        LinkedHashSet<String> fruits = new LinkedHashSet<>();
        fruits.add("mango");
        fruits.add("peach");
        fruits.add("lychee");
        System.out.println(fruits);

        // Task three
        SortedSet<Integer> numbers = new TreeSet<>();
        numbers.add(14);
        numbers.add(23);
        numbers.add(2);
        numbers.add(167);
        System.out.println(numbers);

        // Task four
        NavigableSet<Integer> number = new TreeSet<>();
        number.add(87);
        number.add(6);
        number.add(52);
        System.out.println(number.higher(10));
        System.out.println(number.floor(90));
        System.out.println(number.descendingSet());

        // Task five
        HashMap<String,Integer> grades = new HashMap<>();
        grades.put("Olivia", 5);
        grades.put("Alex", 3);
        grades.put("Alice", 4);
        System.out.println("Students' marks: ");
        for (String names : grades.keySet()) {
            System.out.println(names + " : " + grades.get(names));
        }

        // Task six
        grades.put("Alex", 4);
        System.out.println("Updated marks: ");
        for (String names : grades.keySet()) {
            System.out.println(names + " : " + grades.get(names));
        }


        // Task seven
        LinkedHashSet<Integer> order = new LinkedHashSet<>();
        order.add(13);
        order.add(67);
        order.add(30);
        System.out.println("Numbers in right order: " + order);

        // Task eight
        TreeMap<Integer, String> number_name = new TreeMap<>();
        number_name.put(87, "Oliver");
        number_name.put(23, "Madison");
        number_name.put(46, "Hailey");
        for (int numberr : number_name.keySet()){
            System.out.println("Key: " + numberr + " meaning: " + number_name.get(numberr));
        }

        // Task nine
        NavigableMap<Integer, String> navigate = new TreeMap<>();
        navigate.put(59, "Steven");
        navigate.put(85, "Rosie");
        navigate.put(6, "Noah");
        System.out.println(navigate.firstEntry());
        System.out.println(navigate.lastEntry());
        System.out.println(navigate.higherEntry(51));

        // Mini project
        Set<String> student_names = new HashSet<>();

        student_names.add("Simon");
        student_names.add("Chloe");
        student_names.add("Emma");

        Map<String, Integer> student_marks = new HashMap<>();

        student_marks.put("Simon", 3);
        student_marks.put("Chloe", 5);
        student_marks.put("Emma", 4);

        System.out.println("Our students: " + student_names);
        System.out.println("Students' marks: " + student_marks);

        student_marks.put("Simon", 48);
        student_marks.put("Chloe", 92);
        student_marks.put("Emma", 74);

        System.out.println("Students' average mark: " + student_marks);

    }
}
