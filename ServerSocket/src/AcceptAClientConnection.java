import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class AcceptAClientConnection {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = null;
        try {
            socket = new ServerSocket(8080);
            System.out.println("listening on port: " + socket.getLocalPort());
            Socket connection = socket.accept();
            System.out.println("Connection received from " + connection.getInetAddress().getHostName());
        } catch (IOException e) {
            System.out.println("Could not listen on port: 8080");
            System.exit(-1);
        }
    }
}