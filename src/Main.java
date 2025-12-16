import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Вітаємо у Converter!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Оберіть дію:");
        System.out.println("1. Милі -> Кілометри");
        System.out.println("2. Кілометри -> Милі");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Введіть милі: ");
            double miles = scanner.nextDouble();
            double km = miles * 1.60934;
            System.out.println(miles + " миль = " + km + " км");
        } else if (choice == 2) {
            System.out.print("Введіть кілометри: ");
            double km = scanner.nextDouble();
            double miles = km * 0.621371;
            System.out.println(km + " км = " + miles + " миль");
        } else {
            System.out.println("Невідома команда.");
        }
    }
}