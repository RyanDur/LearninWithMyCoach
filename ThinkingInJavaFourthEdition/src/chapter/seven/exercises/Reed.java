package chapter.seven.exercises;

/**
 * Exercise 7:  (2) Add a new type of Instrument to Music3.java and verify that polymorphism works for your new
 *      type.
 *
 *      @see ExercisesSeven
 */
public class Reed extends Instrument {

    public Reed() {
        System.out.println("Create Reed");
    }

    void play(Note n) {
        System.out.println("Reed.play() " + n);
    }
    String what() { return super.toString(); }
    void adjust() {
        System.out.println("Adjusting Reed");
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
     *      @see ExercisesSeven
     *      @see Brass
     *      @see Percussion
     */
    public void dispose() {
        System.out.println("Dispose of Reed");
        super.dispose();
    }
}
