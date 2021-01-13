import java.util.Scanner;

public class Day6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        scanner.nextLine();

        while (testCases-- > 0) {
            String string = scanner.nextLine();
            String evenIndexedString = skippedIndices(string, 0);
            String oddIndexedString = skippedIndices(string, 1);
            System.out.println(evenIndexedString + ' ' + oddIndexedString);
        }

        scanner.close();
    }

    private static String skippedIndices(String string, int startIndex) {
        StringBuilder result = new StringBuilder();
        for (int index = startIndex ; index < string.length() ; index += 2) {
            result.append(string.charAt(index));
        }
        return result.toString();
    }
}
