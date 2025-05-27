
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println(original.equals(reversed) ? "Palindrome" : "Not a Palindrome");
    }
}
