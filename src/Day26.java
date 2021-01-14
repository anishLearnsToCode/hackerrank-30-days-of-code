import java.util.Scanner;

public class Day26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Date returnDate = new Date(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        Date issueDate = new Date(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println(computeFine(returnDate, issueDate));
    }

    private static int computeFine(Date returnDate, Date issueDate) {
        if (returnDate.year == issueDate.year) {
            if (returnDate.month == issueDate.month) {
                return 15 * Math.max(returnDate.date - issueDate.date, 0);
            } else if (returnDate.month > issueDate.month) {
                return 500 * (returnDate.month - issueDate.month);
            }
        } else if (returnDate.year > issueDate.year) {
            return 10_000;
        }
        return 0;
    }

    private static class Date {
        int date;
        int month;
        int year;

        Date(int date, int month, int year) {
            this.date = date;
            this.month = month;
            this.year = year;
        }
    }
}
