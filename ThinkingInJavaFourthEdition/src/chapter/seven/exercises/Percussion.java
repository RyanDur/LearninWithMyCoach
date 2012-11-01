package chapter.seven.exercises;

/**
 * Exercise 6:  (1) Change Music3.java so that what( ) becomes the root Object method toString( ). Try printing
 *      the Instrument objects using System.out.println( ) (without any casting).
 *
 *      @see Wind
 *      @see ExercisesSeven
 *      @see Stringed
 *      @see Brass
 *      @see Woodwind
 */
public class Percussion extends Instrument {

    public Percussion() {
        System.out.println("Create Percussion");
    }

    void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }
    String what() { return super.toString(); }
    void adjust() {
        System.out.println("Adjusting Percussion");
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
     *      @see Instrument
     *      @see Stringed
     *      @see Reed
     *      @see Brass
     *      @see ExercisesSeven
     */
    public void dispose() {
        System.out.println("Dispose of Percussion");
        super.dispose();
    }
}
