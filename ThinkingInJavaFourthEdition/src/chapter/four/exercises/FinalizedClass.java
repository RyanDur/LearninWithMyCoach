package chapter.four.exercises;

/**
 * Exercise 10:    (2) Create a class with a finalize( ) method that prints a message. In main( ), create an
 *      object of your class. Explain the behavior of your program.
 *
 *      @see ExercisesFour
 */
public class FinalizedClass {

    /**
     * Exercise 11:    (4) Modify the previous exercise so that your finalize( ) will always be called.
     * @throws Throwable
     * @see ExercisesFour
     */
    public FinalizedClass() throws Throwable {
        this.finalize();
    }

    protected void finalize() throws Throwable {
        System.out.println("Finalized");
        super.finalize();
    }

}
