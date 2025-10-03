package Maps;

import java.util.*;

public class MapHw {
    public static void main(String[] args) {
        // Task one
        HashMap<String, Integer> students = new HashMap<>();
        students.put("Zoey", 11);
        students.put("Alice", 16);
        students.put("Stephen", 13);
        students.put("Mark", 14);
        System.out.println(students);
        if(students.containsKey("Alice")){
            System.out.println("You have a student called Alice");
        } else{
            System.out.println("You don't have a student called Alice");
        }
        students.remove("Mark");
        System.out.println(students);


        // Task two
        LinkedHashMap<Integer, String> city = new LinkedHashMap<>();
        city.put(1, "Baku");
        city.put(2, "Istanbul");
        city.put(3, "London");
        city.put(4, "Rome");
        System.out.println(city);
        for (Map.Entry<Integer, String> entry: city.entrySet()){
            System.out.println(entry.getKey());
        }
        for (Map.Entry<Integer, String> entry: city.entrySet()){
            System.out.println(entry.getValue());
        }


        // Task three
        TreeMap<Integer, String> phone_number = new TreeMap<>();
        phone_number.put(123456789, "Ivan");
        phone_number.put(321546789, "Emma");
        phone_number.put(994567891, "Sabina");
        phone_number.put(442135678, "Lily");
        System.out.println(phone_number);
        System.out.println(phone_number.firstEntry());
        System.out.println(phone_number.lastEntry());
        System.out.println(phone_number.higherEntry(400000000));
        System.out.println(phone_number.lowerEntry(300000000));


        // Task four
        HashMap<String, Integer> subjects = new HashMap<>();
        subjects.put("English", 5);
        subjects.put("Chemistry", 3);
        subjects.put("History", 4);
        subjects.put("Math", 4);
        System.out.println(subjects);
        for (Map.Entry<String, Integer> beginning : subjects.entrySet()){
            if (beginning.getValue()> 4){
                System.out.println(beginning.getKey() + " : " + beginning.getValue());
            }
        }
        for (Map.Entry<String, Integer> entry : subjects.entrySet()){
            if (entry.getKey().equals("Math")){
                entry.setValue(entry.getValue()+ 1);
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }


        // Mini Project
        Map<String, String> translate = new HashMap<>();
        translate.put("house", "дом");
        translate.put("apple", "яблоко");
        translate.put("pen", "ручка");
        translate.put("day", "день");
        translate.put("pink", "розовый");
        translate.put("mother", "мама");
        translate.put("t-shirt", "футболка");
        translate.put("car", "машина");
        translate.put("sofa", "диван");
        translate.put("computer", "компьютер");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scanner.nextLine().toLowerCase();

        if (translate.containsKey(word)) {
            System.out.println("Translate of the word: " + translate.get(word));
        } else {
            System.out.println("We don't have that word");
        }
    }
}
