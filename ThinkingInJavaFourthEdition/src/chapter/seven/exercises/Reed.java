package chapter.seven.exercises;

/**
 * Exercise 7:  (2) Add a new type of Instrument to Music3.java and verify that polymorphism works for your new
 *      type.
 *
 *      @see ExercisesSeven
 */
public class Reed extends Instrument {
    void play(Note n) {
        System.out.println("Reed.play() " + n);
    }
    String what() { return super.toString(); }
    void adjust() {
        System.out.println("Adjusting Reed");
    }
}
