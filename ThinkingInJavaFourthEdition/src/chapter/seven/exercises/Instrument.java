package chapter.seven.exercises;

/**
 * Exercise 6:  (1) Change Music3.java so that what( ) becomes the root Object method toString( ). Try printing
 *      the Instrument objects using System.out.println( ) (without any casting).
 *
 *      @see Wind
 *      @see Percussion
 *      @see Stringed
 *      @see Brass
 *      @see Woodwind
 *      @see ExercisesSeven
 *      @see Music3
 */
public class Instrument {
    /**
     * Exercise 14:    (4) Modify Exercise 12 so that one of the member objects is a shared object with reference
     *      counting, and demonstrate that it works properly.
     *      @see ExercisesSeven
     */
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Instrument() {
        System.out.println("Create Instrument");
        System.out.println("Creating " + this);
    }

    void play(Note n) {
        System.out.println("Instrument.play() " + n);
    }
    String what() { return "Instrument"; }
    void adjust() {
        System.out.println("Adjusting Instrument");
    }

    /**
     * Exercise 12:    (3) Modify Exercise 9 so that it demonstrates the order of initialization of the base classes
     *      and derived classes. Now add member objects to both the base and derived classes, and show the order in
     *      which their initialization occurs during construction.
     *
     *      @see Rodent
     *      @see Hamster
     *      @see Mouse
     *      @see Gerbil
     *      @see ExercisesSeven
     *      @see Stringed
     *      @see Reed
     *      @see Brass
     *      @see Percussion
     */
    public void dispose() {
        System.out.println("Dispose of Instrument");
        --refcount;
        System.out.println("Disposing " + this);
    }

    public String toString() {
        return "Instrument " + id;
    }
}
