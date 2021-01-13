import java.util.Scanner;

public class Day10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        System.out.println(maximumConsecutiveBinaryOnes(number));
    }

    private static int maximumConsecutiveBinaryOnes(int number) {
        String binary = Integer.toBinaryString(number);
        int maximumOnes = 0, current = 0;
        for (int index = 0 ; index < binary.length() ; index++) {
            char digit = binary.charAt(index);
            if (digit == '1') {
                current++;
            } else {
                current = 0;
            }
            maximumOnes = Math.max(maximumOnes, current);
        }
        return maximumOnes;
    }
}
