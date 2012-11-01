package chapter.seven.exercises;

/**
 * Exercise 6:  (1) Change Music3.java so that what( ) becomes the root Object method toString( ). Try printing
 *      the Instrument objects using System.out.println( ) (without any casting).
 *
 *      @see Wind
 *      @see Percussion
 *      @see Stringed
 *      @see ExercisesSeven
 *      @see Woodwind
 */
public class Brass extends Wind {

    public Brass() {
        System.out.println("Create Brass");
    }

    void play(Note n) {
        System.out.println("Brass.play() " + n);
    }
    void adjust() {
        System.out.println("Adjusting Brass");
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
     *      @see ExercisesSeven
     *      @see Percussion
     */
    public void dispose() {
        System.out.println("Dispose of Brass");
        super.dispose();
    }
}
