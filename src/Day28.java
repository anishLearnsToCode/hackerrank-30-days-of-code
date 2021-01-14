import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = scanner.nextInt();
        List<String> gmailUsers = new ArrayList<>();

        while (people-- > 0) {
            String name = scanner.next();
            String emailId = scanner.next();
            if (emailId.endsWith("@gmail.com")) {
                gmailUsers.add(name);
            }
        }

        gmailUsers.sort(String::compareTo);
        for (String user : gmailUsers) {
            System.out.println(user);
        }
    }
}
