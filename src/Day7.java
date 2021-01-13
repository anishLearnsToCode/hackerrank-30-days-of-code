import java.util.Scanner;

public class Day7 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int length = SCANNER.nextInt();
        int[] array = getArray(length);
        printReverse(array);
    }

    private static int[] getArray(int length) {
        int[] array = new int[length];
        for (int index = 0 ; index < array.length ; index++) {
            array[index] = SCANNER.nextInt();
        }
        return array;
    }

    private static void printReverse(int[] array) {
        for (int index = 0 ; index < array.length ; index++) {
            System.out.print(array[array.length - 1 - index] + " ");
        }
    }
}
