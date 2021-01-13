import java.util.Scanner;

public class Day9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        System.out.println(factorial(number));
    }

    private static int factorial(int number) {
        return number == 0 ? 1 : number * factorial(number - 1);
    }
}
