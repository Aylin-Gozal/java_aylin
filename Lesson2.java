package StringLessons;

public class Lesson2 {
    public static void main(String[] args) {
        String str1 = "Today is Tuesday";
        String str2 = "Today is a sunny weather";
        if (str1.substring(0, 4).equals(str2.substring(0, 4))){
            System.out.println("They are equal");
        } else{
            System.out.println("They are different");
        }
    }
}
