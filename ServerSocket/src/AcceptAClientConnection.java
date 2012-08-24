import java.io.IOException;
import java.net.ServerSocket;

public class AcceptAClientConnection {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = null;
        try {
            socket = new ServerSocket(8080);
//            System.out.println("listening on port: " + socket.getLocalPort());
//            Socket client = socket.accept();
//            client.setKeepAlive(true);
//            socket.setSoTimeout(1000000000);
        } catch (IOException e) {
            System.out.println("Could not listen on port: 8080");
            System.exit(-1);
        }

//        socket;
//        Socket client = socket.accept();

//        client.connect();
//        client

    }
}