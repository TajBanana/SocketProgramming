import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SingleServer {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(12345);

        System.out.println("[SERVER] Waiting for client connection...");
        Socket socket = server.accept();    //blocking function to accept connection
        System.out.println("[SERVER] Connection established");

        String msg = "";

        PrintWriter serverOut = new PrintWriter(socket.getOutputStream(),true);
        serverOut.println("[Server] This is the message from server");

        socket.close();
        server.close();

    }
}
