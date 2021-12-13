import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class InteractiveClient {
    public static void main(String[] args) throws IOException {
        Socket socket =  new Socket("localhost", 12345);

        BufferedReader serverInput = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter userOut =  new PrintWriter(socket.getOutputStream(),true);

        while (true) {
            System.out.println(">");
            String userMsg = userInput.readLine();
            if (userMsg.equals("exit")) break;

            userOut.println(userMsg);
            String serverMsg = serverInput.readLine();
            System.out.println(serverMsg);
        }

        socket.close();
    }

}
