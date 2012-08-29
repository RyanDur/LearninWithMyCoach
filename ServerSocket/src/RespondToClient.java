import java.io.BufferedReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class RespondToClient {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = null;
        Socket connection = null;
        String response;
        BufferedReader inputReader = null;

        try {
            socket = new ServerSocket(8080);
            System.out.println("listening on port: " + socket.getLocalPort());
            connection = socket.accept();
            System.out.println("Connection received from " + connection);
        } catch (IOException e) {
            System.out.println("Could not listen on port: 8080");
            System.exit(-1);
        }
        connection.close();
    }
}
