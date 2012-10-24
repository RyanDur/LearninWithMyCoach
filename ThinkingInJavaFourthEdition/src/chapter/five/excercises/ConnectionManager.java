package chapter.five.excercises;


/**
 * Exercise 8:  (4) Following the form of the example Lunch.java, create a class called ConnectionManager that
 *      manages a fixed array of Connection objects. The client programmer must not be able to explicitly
 *      create Connection objects, but can only get them via a static method in ConnectionManager. When the
 *      ConnectionManager runs out of objects, it returns a null reference. Test the classes in main( ).
 *      @see ExcercisesFive
 *      @see Connection
 */
public class ConnectionManager {

    /**
     * The client programmer must not be able to explicitly create Connection objects, but can only get them via a
     *      static method in ConnectionManager.
     *      @see Connection
     */
    private ConnectionManager() {}

    private static Connection[] connections  = {Connection.get(), Connection.get(),Connection.get()};
    private static int i = 0;

    /**
     * ConnectionManager manages a fixed array of Connection objects. When the ConnectionManager runs out of objects,
     *      it returns a null reference.
     *      @return Connection or null
     */
    public static Connection getConnection() {
        if (i < connections.length) {
            return connections[i++];
        } else {
            return null;
        }
    }
}
