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
    void play(Note n) {
        System.out.println("Brass.play() " + n);
    }
    void adjust() {
        System.out.println("Adjusting Brass");
    }
}
