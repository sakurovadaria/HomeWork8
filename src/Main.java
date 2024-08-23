public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1 and 2");
        int[] numbers = new int[12];
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


        System.out.println("Task 1");
        int[] weights = {90, 91, 93, 92, 85, 87, 88, 89, 0, 0, 0, 0};
        weights[0] = 90;
        int januaryWeight = weights[0];
        int january = 0;
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }
    }
}