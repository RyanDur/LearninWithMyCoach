import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MultipleIncomingRequests implements Runnable {
    Socket csocket;

    MultipleIncomingRequests(Socket csocket) {
        this.csocket = csocket;
    }

    @Override
    public void run() {
        String statusLine = "HTTP/1.0 200 OK\r\n";
        BufferedReader inputReader = null;
        String response;

        try {
            inputReader = new BufferedReader(new InputStreamReader(csocket.getInputStream()));
            while (!(response = inputReader.readLine()).equals("")) {
                System.out.println(response);
            }
            csocket.getOutputStream().write(statusLine.getBytes());
            csocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        ServerSocket socket = null;
        Socket connection = null;

        try {
            socket = new ServerSocket(8080);
            System.out.println("listening on port: " + socket.getLocalPort());
            while (true) {
                connection = socket.accept();
                Thread thread = new Thread(new MultipleIncomingRequests(connection));
                thread.start();
                System.out.println("Connection received from " + connection);
            }
        } catch (IOException e) {
            System.out.println("Could not listen on port: 8080");
            System.exit(-1);
        }
    }
}
