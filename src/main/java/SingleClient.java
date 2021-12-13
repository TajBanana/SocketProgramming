import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class SingleClient {

    public static void main(String[] args) throws IOException {
        Socket socket =  new Socket("localhost", 12345);

        BufferedReader serverInput = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String serverMsg = serverInput.readLine();
        System.out.println(serverMsg);

        socket.close();

    }
}
