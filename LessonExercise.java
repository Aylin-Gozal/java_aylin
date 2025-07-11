package StringLessons;

public class LessonExercise {
    public static void main(String[] args) {
        String text1 = "Java is one of the most popular programming languages in the world.";
        String text2 = "Java is being used in all big companies";
        System.out.println(text1.length());
        System.out.println(text1.charAt(1));
        System.out.println(text1.substring(text1.length()-4));
        System.out.println(text1.equals(text2));
    }
}
