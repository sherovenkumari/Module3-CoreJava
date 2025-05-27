
import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();
        String name;
        while (!(name = sc.nextLine()).isEmpty()) {
            students.add(name);
        }
        System.out.println("Student List:");
        for (String s : students) {
            System.out.println(s);
        }
    }
}
