import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class AcceptAClientConnection {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = null;
        try {
            socket = new ServerSocket(8080);
            socket.setSoTimeout(1000000000);
        } catch (IOException e) {
            System.out.println("Could not listen on port: 8080");
            System.exit(-1);
        }

//        socket;
        Socket client = socket.accept();

//        client.connect();
//        client

    }
}