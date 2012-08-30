import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class RespondToClient {
    public static void main(String[] args) {
        String statusLine = "HTTP/1.0 200 OK\r\n";
        ServerSocket socket = null;
        Socket connection = null;
        BufferedReader inputReader = null;
        String response;

        try {
            socket = new ServerSocket(8080);
            System.out.println("listening on port: " + socket.getLocalPort());
            connection = socket.accept();
            System.out.println("Connection received from " + connection);
            inputReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            while (!(response = inputReader.readLine()).equals("")) {
                System.out.println(response);
            }
            connection.getOutputStream().write(statusLine.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                socket.close();
                connection.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
