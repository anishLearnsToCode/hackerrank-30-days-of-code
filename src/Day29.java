import java.util.Scanner;

public class Day29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while (testCases-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            System.out.println(maximumBitwiseAnd(n, k));
        }
    }

    private static int maximumBitwiseAnd(int n, int k) {
        int maximumBitwiseAnd = 0;
        for (int i = 1 ; i <= n ; i++) {
            for (int j = i + 1 ; j <= n ; j++) {
                int currentBitwise = i & j;
                if (maximumBitwiseAnd < currentBitwise && currentBitwise < k) {
                    maximumBitwiseAnd = currentBitwise;
                    if (maximumBitwiseAnd == k - 1) {
                        return maximumBitwiseAnd;
                    }
                }
            }
        }
        return maximumBitwiseAnd;
    }
}
