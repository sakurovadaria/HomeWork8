import javax.naming.PartialResultException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1 and 2");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.print(numbers[i]);
            if (numbers[i] != 3) {
                System.out.print(", ");
            }
        }
        System.out.println();
        float[] numbers2 = {1.57f, 7.654f, 9.986f};
        for (int i = 0; i < 3; i++) {
            System.out.print(numbers2[i]);
            if (numbers2[i] != 9.986f) {
                System.out.print(", ");
            }
        }
        System.out.println();
        int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 95, 98, 96, 100};
        for (int i = 0; i < weights.length; i++) {
            System.out.print(weights[i]);
            if (weights[i] != 100) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Task 3");
        int[] numbers3 = new int[3];
        numbers3[0] = 1;
        numbers3[1] = 2;
        numbers3[2] = 3;
        for (int i = numbers3.length - 1; i >= 0; i--) {
            System.out.print(numbers3[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        float[] numbers4 = {1.57f, 7.654f, 9.986f};
        for (int i = numbers4.length - 1; i >= 0; i--) {
            System.out.print(numbers4[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        int[] weights2 = {90, 91, 93, 92, 85, 87, 88, 89, 95, 98, 96, 100};
        for (int i = weights2.length - 1; i >= 0; i--) {
            System.out.print(weights2[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Task 4");
        int[] taskForeNumbers = {1, 2, 3};
        for (int i = 0; i < 3; i++) {
            if (taskForeNumbers[i] % 2 != 0) {
                taskForeNumbers[i] += 1;
            }
            System.out.print(taskForeNumbers[i]);
            if (taskForeNumbers[i] != 4) {
                System.out.print(", ");
            }
        }
    }
}