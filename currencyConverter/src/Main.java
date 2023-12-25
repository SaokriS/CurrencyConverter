import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** Добро пожаловать в конвертер валют! ***");

        System.out.println("Введите колличество рублей:");
        double rubCount = new Scanner(System.in).nextDouble();

        System.out.println("Введите актуальный курс евро:");
        double euroPrice = new Scanner(System.in).nextDouble();

        System.out.println("Введите актуальный курс доллара:");
        double dollarPrice = new Scanner(System.in).nextDouble();

        System.out.println("Введите актуальный курс юань");
        double yuanPrice = new Scanner(System.in).nextDouble();

        System.out.println(rubCount + " рублей это: " + rubCount * (1 / euroPrice) + " евро.");
        System.out.println(rubCount + " рублей это: " + rubCount * (1 / dollarPrice) + " долларов.");
        System.out.println(rubCount + " рублей это: " + rubCount * (1 / yuanPrice) + " юань.");
    }
}
