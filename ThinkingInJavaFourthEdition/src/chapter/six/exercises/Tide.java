package chapter.six.exercises;

/**
 * Exercise 2:  (2) Inherit a new class from class Detergent. Override scrub( ) and add a new method called
 *      sterilize( ).
 *
 *      @see ExercisesSix
 *      @see Detergent
 *      @see Cleanser
 */
public class Tide extends Detergent {

    public void scrub() {
        append(" Tide.Detergent.scrub()");
    }

    public void sterilize() {
        append(" sterilize()");
    }
}
