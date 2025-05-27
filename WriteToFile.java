
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        try {
            FileWriter fw = new FileWriter("output.txt");
            fw.write(data);
            fw.close();
            System.out.println("Data written to file.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }
}
