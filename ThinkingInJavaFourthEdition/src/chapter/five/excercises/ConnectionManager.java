package chapter.five.excercises;

public class ConnectionManager {

    private static Connection[] connections  = {new Connection(),new Connection(),new Connection()};
    private static int i = 0;

    public static Connection getConnection() {
        if (i < connections.length) {
            return connections[i++];
        } else {
            return null;
        }
    }
}
