package chapter.six.exercises;

/**
 * Exercise 2:  (2) Inherit a new class from class Detergent. Override scrub( ) and add a new method called
 *      sterilize( ).
 *
 *      @see ExercisesSix
 *      @see Detergent
 *      @see Tide
 */
public class Cleanser {

    private String s = "Cleanser";

    public void append(String a) {
        s += a;
    }

    public void dilute() {
        append(" dilute()");
    }

    public void apply() {
        append(" apply()");
    }

    public void scrub() {
        append(" scrub()");
    }

    public String toString() {
        return s;
    }
}
