import java.util.Scanner;

public class Day3 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        if (N % 2 == 1 || (6 <= N && N <= 20)) {
            System.out.println("Weird");
        } else if ((2 <= N && N <= 5) || N >20) {
            System.out.println("Not Weird");
        }
        scanner.close();
    }
}
