import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<String, Integer> directory = new HashMap<>();

        for(int i = 0; i < n; i++){
            String name = scanner.next();
            int phone = scanner.nextInt();
            directory.put(name, phone);
        }

        while(scanner.hasNext()){
            String query = scanner.next();
            if (directory.containsKey(query)) {
                System.out.println(query + "=" + directory.get(query));
            } else {
                System.out.println("Not found");
            }
        }

        scanner.close();
    }
}
