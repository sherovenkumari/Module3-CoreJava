
import java.io.*;
import java.net.*;

public class ChatServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(5000);
        Socket socket = server.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        out.println("Connected to server.");
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println("Client: " + line);
        }
        socket.close();
        server.close();
    }
}
