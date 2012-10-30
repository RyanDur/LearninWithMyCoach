package chapter.seven.exercises;

/**
 * Exercise 6:  (1) Change Music3.java so that what( ) becomes the root Object method toString( ). Try printing
 *      the Instrument objects using System.out.println( ) (without any casting).
 *
 *      @see ExercisesSeven
 *      @see Percussion
 *      @see Stringed
 *      @see Brass
 *      @see Woodwind
 */
public class Wind extends Instrument {
    void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
    String what() { return super.toString(); }
    void adjust() {
        System.out.println("Adjusting Wind");
    }
}
