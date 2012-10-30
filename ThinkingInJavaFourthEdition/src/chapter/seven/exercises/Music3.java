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
 *      @see Instrument
 *      @see ExercisesSeven
 */
public class Music3 {
    public static void tuneAll(Instrument[] e) {
        for(Instrument i : e)
            tune(i);
    }

    public static void tune(Instrument i) {
        // ...
        i.play(Note.MIDDLE_C);
    }
}
