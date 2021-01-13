import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Read and save an integer, double, and String to your variables.*/
        int number = scan.nextInt();
        double precision = scan.nextDouble();
        scan.nextLine();
        String string = scan.next();

        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
        System.out.println(number + i);

        /* Print the sum of the double variables on a new line. */
        System.out.println(precision + d);

        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s + string);

        scan.close();
    }
}
