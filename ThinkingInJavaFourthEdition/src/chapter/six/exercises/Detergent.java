package chapter.six.exercises;

/**
 * Exercise 2:  (2) Inherit a new class from class Detergent. Override scrub( ) and add a new method called
 *      sterilize( ).
 *
 *      @see ExercisesSix
 *      @see Tide
 *      @see Cleanser
 */
public class Detergent {

    /**
     * Exercise 11:    (3) Modify Detergent.java so that it uses delegation.
     *
     *      @see ExercisesSix
     */
    Cleanser cleanser = new Cleanser();

    @Override
    public String toString() {
        return cleanser.toString();
    }

    public void scrub() {
        append(" Detergent.scrub()");
        cleanser.scrub();
    }

    public void apply() {
        cleanser.apply();
    }

    public void dilute() {
        cleanser.dilute();
    }

    public void append(String a) {
        cleanser.append(a);
    }

    public void foam() {
        append(" foam()");
    }
}
