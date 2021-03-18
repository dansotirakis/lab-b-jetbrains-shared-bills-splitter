import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        scanner.nextLine();
        int[] array = Arrays.stream(Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray()).toArray();
        System.out.println(getMax(array));

    }

    // Method for getting the maximum value
    public static int getMax(int[] inputArray) {
        ArrayList<Integer> result = new ArrayList<>();
        int maxValue = inputArray[0];
        int maxValueTwo = 0;
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
                inputArray[i] = 0;
            } else {
                result.add(inputArray[i]);
            }
        }
        for (Integer integer : result) {
            if (integer > maxValueTwo) {
                maxValueTwo = integer;
            }
        }

        return maxValue * maxValueTwo;
    }
}