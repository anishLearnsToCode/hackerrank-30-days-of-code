import java.util.Scanner;

public class Day5 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int number = SCANNER.nextInt();
        for (int i = 1 ; i <= 10 ; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
