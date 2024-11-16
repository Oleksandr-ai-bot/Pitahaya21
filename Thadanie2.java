import java.util.Scanner;

public class Thadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість кутів багатокутника: ");
        int n = scanner.nextInt();
        int[] angles = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Введіть кут " + (i + 1) + ": ");
            angles[i] = scanner.nextInt();
            sum += angles[i];
        }

        int expectedSum = 180 * (n - 2);
        System.out.println("Сума введених кутів: " + sum);
        System.out.println("Очікувана сума кутів для багатокутника з " + n + " кутами: " + expectedSum);

        if (sum == expectedSum) {
            System.out.println("Багатокутник може існувати.");
        } else {
            System.out.println("Багатокутник не може існувати.");
        }
    }
}
