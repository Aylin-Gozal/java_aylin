package StringLessons;

public class StringBuilder_hw {
    public static void main(String[] args) {
        // Append
        StringBuilder hello = new StringBuilder("Hello");
        hello.append(" World");
        System.out.println(hello);

        // Insert
        StringBuilder insert = new StringBuilder("Java fun");
        insert.insert(4, " is");
        System.out.println(insert);

        // Replace
        StringBuilder replace = new StringBuilder("I like Java");
        replace.replace(7, 11, "Python");
        System.out.println(replace);

        // Delete
        StringBuilder delete = new StringBuilder("Delete this word");
        delete.delete(7, 11);
        System.out.println(delete);

        //Reverse
        StringBuilder reverse = new StringBuilder("12345");
        reverse.reverse();
        System.out.println(reverse);

        // Length
        StringBuilder length = new StringBuilder("Java Programming");
        System.out.println(length.length());

        // Delete
        StringBuilder delete1 = new StringBuilder("Java is Programming");
        delete1.delete(delete1.length() -5, delete1.length());
        System.out.println(delete1);

        StringBuilder delete2 = new StringBuilder("ProgrammingInJava");
        delete2.delete(10, delete2.length());
        System.out.println(delete2);

        // Set Char At
        StringBuilder setchar = new StringBuilder("Hell0");
        setchar.setCharAt(4, 'o');
        System.out.println(setchar);

        // Replaces
        StringBuilder sentence = new StringBuilder("User {name} has {points}");
        sentence.replace(5, 11, "Ali");
        sentence.replace(13, 21, "150");
        System.out.println(sentence);
    }
}
