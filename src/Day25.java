import java.util.Scanner;

public class Day25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while (testCases-- > 0) {
            long number = scanner.nextLong();
            System.out.println(isPrime(number) ? "Prime" : "Not prime");
        }
        scanner.close();
    }

    private static boolean isPrime(long number) {
        if (number == 1) {
            return false;
        }
        for (long divisor = 2 ; divisor <= number / divisor ; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
