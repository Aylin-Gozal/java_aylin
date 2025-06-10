package Exercise;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        //name
//        System.out.println("Enter your name: ");
//        String name = scanner.nextLine();
//
//
//        // age
//        System.out.println("Enter your age: ");
//        int age = scanner.nextInt();
//        scanner.nextLine();
//
//
//        // height
//        System.out.println("Enter your height: ");
//        int height = scanner.nextInt();
//        scanner.nextLine();
//
//        //sale card
//        System.out.println("Do you have a membership card? yes/no");
//        boolean membership = scanner.nextBoolean();
//        scanner.nextLine();
//
//        //alphabet letter
//        System.out.println("Enter your favorite alphabet letter.");
//        char letter = scanner.next().charAt(0);
//        scanner.nextLine();
//
//        //number of purchases
//        System.out.println("Enter the number of your purchases from 1 to 3.");
//        int number = scanner.nextInt();
//        scanner.nextLine();
//
//
//
//        double [] purchases = new double[3];
//        if
//
//





        System.out.println("Введите ваше имя: ");
        String name = scanner.nextLine();

        System.out.println("Введите ваш возраст: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите ваш рост в метрах: ");
        double height = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("У вас есть скидочная карта? (да/нет): ");
        String discountInput = scanner.next();
        boolean hasDiscountCard = discountInput.equalsIgnoreCase("да");
        scanner.nextLine();

        System.out.println("Введите вашу любимую букву алфавита: ");
        char favoriteLetter = scanner.next().charAt(0);

        System.out.println("Сколько у вас покупок (1-3): ");
        int numberOfPurchases = scanner.nextInt();
        scanner.nextLine();

        // 2. Записываем покупки в массив
        double[] purchases = new double[3];
        for (int i = 0; i < numberOfPurchases; i++) {
            System.out.println("Введите стоимость покупки " + (i + 1) + ": ");
            purchases[i] = scanner.nextDouble();
        }

        // 3. Подсчитываем сумму и скидку
        double total = purchases[0] + purchases[1] + purchases[2];
        double finalTotal = hasDiscountCard ? total * 0.9 : total;

        // 4. Оцениваем возраст
        String status;
        if (age < 12) {
            status = "Ребёнок";
        } else if (age <= 17) {
            status = "Подросток";
        } else if (age <= 59) {
            status = "Взрослый";
        } else {
            status = "Пенсионер";
        }




        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Рост: " + height + " м");
        System.out.println("Статус: " + status);
        System.out.println("Сумма покупок: " + total + " $");
        System.out.println("Итоговая сумма со скидкой: " + finalTotal + " $");
        System.out.println("Любимая буква: " + favoriteLetter);
    }
}
