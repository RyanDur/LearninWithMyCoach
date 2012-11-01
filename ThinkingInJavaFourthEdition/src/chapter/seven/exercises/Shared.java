package chapter.seven.exercises;

/**
 * Exercise 13:    (3) Add a finalize( ) method to ReferenceCounting.java to verify the termination condition
 *      (see the Initialization & Cleanup chapter).
 *
 *      @see ReferenceCounting
 *      @see ExercisesSeven
 *      @see Composing
 */
public class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;
    public Shared() {
        System.out.println("Creating " + this);
    }
    public void addRef() { refcount++; }
    protected void dispose() {
        if(--refcount == 0)
            System.out.println("Disposing " + this);
    }
    public String toString() { return "Shared " + id; }
}
