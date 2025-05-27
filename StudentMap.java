
import java.util.HashMap;
import java.util.Scanner;

public class StudentMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Alice");
        map.put(2, "Bob");
        System.out.print("Enter ID to retrieve name: ");
        int id = sc.nextInt();
        System.out.println("Name: " + map.getOrDefault(id, "Not found"));
    }
}
