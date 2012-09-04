import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MultipleIncomingRequests implements Runnable {
    private ServerSocket socket = null;
    private Socket connection = null;
    private Thread thread = null;

    public MultipleIncomingRequests() {
        try {
            socket = new ServerSocket(8080);
            System.out.println("listening on port: " + socket.getLocalPort());
            start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void start() {
        if (thread == null) {
            thread = new Thread(this);
            thread.start();
        }
    }

    public void stop() throws IOException {
        connection.close();
    }

    public void read() throws IOException {
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String statusLine = "HTTP/1.0 200 OK\r\n";
        String response;
        while (!(response = inputReader.readLine()).equals("")) {
            System.out.println(response);
        }
        connection.getOutputStream().write(statusLine.getBytes());
    }

    @Override
    public void run() {
        while (null != thread) {
            try {
                connection = socket.accept();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Connection received from " + connection);
        }
    }

    public static void main(String[] args) {

    }
}
