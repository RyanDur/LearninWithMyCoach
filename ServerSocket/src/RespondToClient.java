import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class RespondToClient {
    public static void main(String[] args) throws IOException {
        String statusLine = "HTTP/1.1 200 OK";
        ServerSocket socket = null;
        Socket connection = null;
        BufferedReader inputReader = null;
        String response;

        try {
            socket = new ServerSocket(8080);
            System.out.println("listening on port: " + socket.getLocalPort());
            connection = socket.accept();
            System.out.println("Connection received from " + connection);
            connection.getOutputStream().write(statusLine.getBytes());
            inputReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        } catch (IOException e) {
            System.out.println("Could not listen on port: 8080");
            System.exit(-1);
        }
        while ((response = inputReader.readLine()) != null) {
            System.out.println(response);
        }
        connection.close();
    }
}
