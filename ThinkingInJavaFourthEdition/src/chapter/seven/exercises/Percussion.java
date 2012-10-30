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
    void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }
    String what() { return super.toString(); }
    void adjust() {
        System.out.println("Adjusting Percussion");
    }
}
