package StringLessons;

public class String_hw {
    public static void main(String[] args) {
        //length
        String length = "Programming";

        // Char
        String charAt = "Hello";

        // Substring
        String substring = "I love Java";

        // Index Of
        String indexOf = "I like cookies";

        // Upper Case & Lower Case
        String cases = "Java";

        // Replace
        String word = "banana";
        String replace = word.replace("a", "*");

        // Equals & ==
        String a = "Hello";
        String b = new String("Hello");

        System.out.println(length.length());
        System.out.println(charAt.charAt(2));
        System.out.println(substring.substring(2, 6));
        System.out.println(indexOf.indexOf("cookies"));
        System.out.println(cases.toUpperCase());
        System.out.println(cases.toLowerCase());
        System.out.println(replace);
        System.out.println(a.equals(b));
        System.out.println(a == b);
    }
}
