import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class AcceptAClientConnection {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = null;
        String response;
        BufferedReader inputReader = null;

        try {
            socket = new ServerSocket(8080);
            System.out.println("listening on port: " + socket.getLocalPort());
            Socket connection = socket.accept();
            System.out.println("Connection received from " + connection);
            inputReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        } catch (IOException e) {
            System.out.println("Could not listen on port: 8080");
            System.exit(-1);
        }
        while ((response = inputReader.readLine()) != null) {
            System.out.println(response);
        }
    }
}