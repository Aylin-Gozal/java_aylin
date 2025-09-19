package Changing;

import java.util.Scanner;

public class CastingHW {
    public static void main(String[] args) {
        // Task One
        System.out.println("Task One");
        int first = 200;
        byte second = (byte)first;
        System.out.println(first);
        System.out.println(second);

        double a = 15.75;
        int b = (int) a;
        System.out.println(a);
        System.out.println(b);


        // Task Two
        System.out.println("Task Two");
        byte x = 50;
        short y = 60;
        int z = (int) x + y;
        byte n = (byte) z;
        System.out.println(z);
        System.out.println(n);

        long l = 1000;
        float k = (float) l;
        double m = (double) l;
        System.out.println(k);
        System.out.println(m);


        // Task Three
        System.out.println("Task Three");
        double price = 23.55;
        int quantity = 4;
        double total = price * quantity;
        int total2 = (int) total;
        System.out.println("Total price with cents: " + total);
        System.out.println("Total price without cents: " + total2);


        int number1 = 128;
        int number2 = 258;
        int number3 = 1024;
        byte convert1 = (byte) number1;
        byte convert2 = (byte) number2;
        byte convert3 = (byte) number3;
        System.out.println(convert1);
        System.out.println(convert2);
        System.out.println(convert3);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a double number: ");
        double enter = scanner.nextDouble();
        int numbers = (int) enter;
        double others = enter - numbers;
        System.out.println("Integer part: " + numbers);
        System.out.println("Fractional part: " + others);
    }
}
