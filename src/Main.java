import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();

    }

    public static void task1() {
        System.out.println("\n\n" +
                "=============================\n" +
                "======= Задания 1 и 2 =======\n" +
                "=============================\n");

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        double[] numbersTwo = {1.57, 7.654, 9.986};

        int[] numbersThree = new int[3];
        numbersThree[2] = 7;

        System.out.println(numbers[0] + ", " + numbers[1] + ", " + numbers[2]);
        System.out.println(numbersTwo[0] + ", " + numbersTwo[1] + ", " + numbersTwo[2]);
        System.out.println(numbersThree[0] + ", " + numbersThree[1] + ", " + numbersThree[2]);

        System.out.println("\n\n" +
                "=============================\n" +
                "========= Задание 3 =========\n" +
                "=============================\n");


        System.out.println(numbers[2] + ", " + numbers[1] + ", " + numbers[0]);
        System.out.println(numbersTwo[2] + ", " + numbersTwo[1] + ", " + numbersTwo[0]);
        System.out.println(numbersThree[2] + ", " + numbersThree[1] + ", " + numbersThree[0]);


        System.out.println("\n\n" +
                "=============================\n" +
                "========= Задание 4 =========\n" +
                "=============================\n");

        for (int i = 0; i <= 2; i++) {
            if (numbers[i] % 2 == 1) {
                numbers[i]++;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }


}