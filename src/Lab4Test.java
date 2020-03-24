import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Lab4Test {
    public static void main(String[] args) {
        int[] arr = new int[15];
        int sum = 0;
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int nunmber = random.nextInt(7) + 1;
            arr[i] = nunmber;
            if (nunmber % 2 == 1) {
                sum = sum + nunmber;
                System.out.println(nunmber + " Сумма Чисел -->" + sum);
            }

        }
    }
}
