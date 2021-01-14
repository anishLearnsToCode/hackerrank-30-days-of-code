import java.util.Scanner;

public class Day20 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int length = SCANNER.nextInt();
        int[] array = getArray(length);
        int swaps = bubbleSort(array);
        System.out.println("Array is sorted in " + swaps + " swaps.");
        System.out.println("First Element: " + array[0]);
        System.out.println("Last Element: " + array[array.length - 1]);
    }

    private static int bubbleSort(int[] array) {
        int totalSwaps = 0;
        for (int i = 0; i < array.length; i++) {
            int numberOfSwaps = 0;

            for (int j = 0; j < array.length - 1 ; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    numberOfSwaps++;
                }
            }

            totalSwaps += numberOfSwaps;

            if (numberOfSwaps == 0) {
                break;
            }
        }

        return totalSwaps;
    }

    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static int[] getArray(int length) {
        int[] array = new int[length];
        for (int index = 0 ; index < length ; index++) {
            array[index] = SCANNER.nextInt();
        }
        return array;
    }
}
