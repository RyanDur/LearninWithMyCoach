package debug;

/**
 * Exercise 3:  (2) Create two packages: debug and debugoff, containing an identical class with a debug( )
 *      method. The first version displays its String argument to the console, the second does nothing. Use a
 *      static import line to import the class into a test program, and demonstrate the conditional compilation
 *      effect.
 *      @see debugoff.Twin
 */
public class Twin {

    /**
     * The first version displays its String argument to the console
     * @param string
     */
    public void debug(String string){
        System.out.println(string);
    }
}
