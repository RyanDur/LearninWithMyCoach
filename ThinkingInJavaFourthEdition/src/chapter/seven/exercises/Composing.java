package chapter.seven.exercises;

/**
 * Exercise 13:    (3) Add a finalize( ) method to ReferenceCounting.java to verify the termination condition
 *      (see the Initialization & Cleanup chapter).
 *
 *      @see ReferenceCounting
 *      @see Shared
 *      @see ExercisesSeven
 */
public class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    public Composing(Shared shared) {
        System.out.println("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }
    protected void dispose() {
        System.out.println("disposing " + this);
        shared.dispose();
    }
    public String toString() { return "Composing " + id; }
}
