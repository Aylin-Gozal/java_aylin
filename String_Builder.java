package StringLessons;

public class String_Builder {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder("Aylin");
//        System.out.println(sb);
//        sb.append(" Gozal");
//        System.out.println(sb);
//
//        StringBuilder sb1 = new StringBuilder("Hello");
//        sb1.append(" World");
//        sb1.append("!");
//        System.out.println(sb1);





//        StringBuilder sb = new StringBuilder("Java");
//        sb.append(" is language");
//        sb.insert(7, " programming");
//        sb.replace(0, 4, "Python");
//        sb.deleteCharAt(0);
//        System.out.println(sb);
//        sb.reverse();
//        System.out.println(sb);
//        System.out.println(sb.length());
//        sb.delete(sb.length() -10, sb.length());
//        sb.delete(0, sb.length() - 10);
//        System.out.println(sb);

        // string < stringbuffer < stringbuilder



//        StringBuilder sb1 = new StringBuilder("Ayl1n");
//        System.out.println(sb1);
//        sb1.setCharAt(3, 'i');
//        System.out.println(sb1);
//
//
//
//        StringBuilder sb2 = new StringBuilder();
//        System.out.println(sb2.capacity());





        StringBuilder sb = new StringBuilder("Hello World");
        System.out.println(sb.length());
        sb.insert(0, "***");
        sb.insert(14, "***");
        System.out.println(sb);
        sb.replace(3, 14, "Privet Mir!");
        System.out.println(sb);
        System.out.println(sb.toString().toUpperCase());

    }
}
