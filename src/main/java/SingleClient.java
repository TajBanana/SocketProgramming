import java.io.IOException;
import java.net.Socket;

public class SingleClient {

    public static void main(String[] args) throws IOException {
        Socket socket =  new Socket("localhost", 12345);

    }
}
