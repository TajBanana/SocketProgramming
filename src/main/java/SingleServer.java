import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SingleServer {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(12345);
        Socket socket = server.accept();    //blocking function for the server
        String msg = "";

        System.out.println("Listening for connection at port 12345");

    }
}
