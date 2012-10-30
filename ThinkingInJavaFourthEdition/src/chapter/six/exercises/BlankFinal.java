package chapter.six.exercises;

/**
 * Exercise 19:    (2) Create a class with a blank final reference to an object. Perform the initialization of
 *      the blank final inside all constructors. Demonstrate the guarantee that the final must be initialized
 *      before use, and that it cannot be changed once initialized.
 *
 *      @see ExercisesSix
 */
public class BlankFinal {

    final Frog frog;

    public BlankFinal(Frog frog) {
//        System.out.println(this.frog);
        this.frog = frog;
        System.out.println(this.frog);
    }
}
