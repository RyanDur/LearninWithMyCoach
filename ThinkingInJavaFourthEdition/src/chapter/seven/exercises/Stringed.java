package chapter.seven.exercises;

/**
 * Exercise 6:  (1) Change Music3.java so that what( ) becomes the root Object method toString( ). Try printing
 *      the Instrument objects using System.out.println( ) (without any casting).
 *
 *      @see Wind
 *      @see Percussion
 *      @see ExercisesSeven
 *      @see Brass
 *      @see Woodwind
 */
public class Stringed extends Instrument {
    void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }
    String what() { return super.toString(); }
    void adjust() {
        System.out.println("Adjusting Stringed");
    }
}
