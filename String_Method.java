package StringLessons;

public class String_Method {
    public static void main(String[] args) {
//        // to String
//        Integer a = 123;
//        String s = Integer.toString(a);
//        System.out.println(s);
//
//        // Char At
//        String word = "Programming";
//        System.out.println(word.charAt(4));
//
//        // Get Chars
//        String text = "Hello, World";
//        char[] massive = new char[3];
//        text.getChars(8, 10, massive, 0);
//        System.out.println(massive);
//
//        // To Char Array
//        String text1 = "Dog";
//        char[] symbols = text1.toCharArray();
//        for(char c : symbols){
//            System.out.println(c);
//        }
//
//        // Region Matches
//        String str1 = "Programmer";
//        String str2 = "Program";
//        boolean bool = str1.regionMatches(0, str2, 0,  4);
//        System.out.println(bool);
//
//        // Starts with & Ends with
//        String str3 = "Information";
//        System.out.println(str3.startsWith("I")); // true
//        System.out.println(str3.endsWith("ma")); // false
//
//        // Compare to
//        String text3 = "Java";
//        String text4 = "Avaj";
//        System.out.println(text3.compareTo(text4));
//
//        // Index of & Last index of
//        String c = "Aylin";
//        System.out.println(c.indexOf("A"));
//        System.out.println(c.lastIndexOf("n"));
//
//        // Concat
//        String s1 = "Hello,";
//        String s2 = " World";
//        String s3 = s1.concat(s2);
//        System.out.println(s3);
//        System.out.println(s1.concat(" children"));
//
//        // Trim
//        String text_1 = "              Java is a programming language";
//        System.out.println(text_1);
//        System.out.println(text_1.trim());
//
//        // Value of
//        int number = 45;
//        System.out.println(String.valueOf(number));
//
//        // Join
//        String join_str = String.join(", ", "Aylin", "Kanan", "Mansur");
//        System.out.println(join_str);
//    }




        // HOMEWORK

        // to String
        Integer number = 570;
        String n = Integer.toString(number);
        System.out.println(n);

        // Char At
        String word = "Technology";
        System.out.println(word.charAt(8));

        // Get Chars
        String sentence = "Good morning, everyone";
        char[] massive = new char[3];
        sentence.getChars(5, 8, massive, 0);
        System.out.println(massive);

        // To Char Array
        String animal = "Cat";
        char[] symbols = animal.toCharArray();
        for(char a : symbols){
            System.out.println(a);
        }

        // Region Matches
        String string1 = "Teach";
        String string2 = "Teacher";
        boolean bool = string1.regionMatches(0, string2, 0,  5);
        System.out.println(bool);

        // Starts with & Ends with
        String str3 = "Lesson";
        System.out.println(str3.startsWith("L")); // true
        System.out.println(str3.endsWith("on")); // false

        // Compare to
        String subject1 = "Math";
        String subject2 = "Science";
        System.out.println(subject2.compareTo(subject1));

        // Index of & Last index of
        String name = "Aylin";
        System.out.println(name.indexOf("A"));
        System.out.println(name.lastIndexOf("n"));

        // Concat
        String word1 = "Welcome,";
        String word2 = " to";
        String word3 = " the Airport";
        String word4 = word1.concat(word2).concat(word3);
        System.out.println(word4);
        System.out.println(word1.concat(" dear guests"));

        // Trim
        String sentence_1 = "              Water is a liquid";
        System.out.println(sentence_1);
        System.out.println(sentence_1.trim());

        // Value of
        int value = 45;
        System.out.println(String.valueOf(value));

        // Join
        String join_str = String.join(", ", "Charlie", "Amanda", "Anna");
        System.out.println(join_str);
    }
}
