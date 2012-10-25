package chapter.four.exercises;

/**
 * Exercise 12:    (4) Create a class called Tank that can be filled and emptied, and has a termination
 *      condition that it must be releaseTank when the object is cleaned up. Write a finalize( ) that verifies
 *      this termination condition. In main( ), test the possible scenarios that can occur when your Tank is
 *      used.
 *
 *      @see ExercisesFour
 */
public class Tank {

    private boolean empty = false;

    public void empty() {
        empty = true;
    }

    /**
     * Exercise 13:    (1) Verify the statements in the previous paragraph.
     *
     * @see ExercisesFour
     */
    public boolean isEmpty() {
        return empty;
    }

    /**
     * ...and has a termination condition that it must be releaseTank when the object is cleaned up.
     *
     * @see ExercisesFour
     */
    public void releaseTank() throws Throwable {
        this.finalize();
    }

    /**
     * Write a finalize( ) that verifies this termination condition.
     *
     * @throws Throwable
     * @see ExercisesFour
     */
    protected void finalize() throws Throwable {
        if (empty) {
            System.out.println("Tank is empty");
            super.finalize();
        }
    }
}
