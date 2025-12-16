import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Проект Converter. Версія 1.1");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть кількість миль:");
        double miles = scanner.nextDouble();
        double kilometers = miles * 1.60934;

        System.out.println(miles + " миль = " + kilometers + " кілометрів.");
    }
}