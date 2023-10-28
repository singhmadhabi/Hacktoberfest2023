import java.util.Arrays;

public class FindSumInArray {

    public static void findSum(int[] arr, int target) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair found: " + arr[i] + " + " + arr[j] + " = " + target);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] sampleArray = {1, 2, 4, 5, 6};
        int targetValue = 6;

        System.out.println("Sample array: " + Arrays.toString(sampleArray));
        System.out.println("Target value: " + targetValue);

        findSum(sampleArray, targetValue);
    }
}
