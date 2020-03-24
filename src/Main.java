import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Random random = new Random();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int nunmber = random.nextInt(7) + 1;
            int[] ints = arr[i];
            for (int j = 0; j < ints.length; j++) {
                int anInt = ints[j];
                arr[i][j] = nunmber;
                sum = sum + nunmber;
                System.out.println(nunmber + " Сумма Чисел -->" + sum);
            }

        }
    }
}
