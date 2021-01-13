import java.util.Scanner;

public class Day16 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int number = Integer.parseInt(scanner.next());
            System.out.println(number);
        } catch (NumberFormatException exception) {
            System.out.println("Bad String");
        }
    }
}
