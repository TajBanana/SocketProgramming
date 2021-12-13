import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class InteractiveServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(12345);

        System.out.println("[SERVER] Waiting for client connection...");
        Socket socket = server.accept();    //blocking function to accept connection
        System.out.println("[SERVER] Connection established");

        PrintWriter serverOut = new PrintWriter(socket.getOutputStream(),true);

        BufferedReader clientInput = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        try {
            while (true) {
//                one socket can only have one serverOut I think?
                String clientMsg = clientInput.readLine();
                serverOut.println("[SERVER] " + clientMsg);
            }
        } finally {
            socket.close();
            server.close();
        }
    }
}
