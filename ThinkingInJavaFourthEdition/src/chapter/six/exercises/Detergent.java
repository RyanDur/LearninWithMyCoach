package chapter.six.exercises;

/**
 * Exercise 2:  (2) Inherit a new class from class Detergent. Override scrub( ) and add a new method called
 *      sterilize( ).
 *
 *      @see ExercisesSix
 *      @see Tide
 *      @see Cleanser
 */
public class Detergent extends Cleanser {

    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub();
    }

    public void foam() {
        append(" foam()");
    }
}
