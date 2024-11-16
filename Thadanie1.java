import java.util.Random;

public class Thadanie1 {
    public static void main(String[] args) {
        int size = 10;
        int[] array = new int[size];
        Random random = new Random();

        int evenCount = 0, oddCount = 0;

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
            if (array[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Масив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println("\nКількість парних чисел: " + evenCount);
        System.out.println("Кількість непарних чисел: " + oddCount);
    }
}
