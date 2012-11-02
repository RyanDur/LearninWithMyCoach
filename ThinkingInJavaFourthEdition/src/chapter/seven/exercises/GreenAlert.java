package chapter.seven.exercises;

/**
 * Exercise 16:    (3) Following the example in Transmogrify.java, create a Starship class containing an
 *      AlertStatus reference that can indicate three different states. Include methods to change the states.
 *
 *      @see Starship
 *      @see AlertStatus
 *      @see ExercisesSeven
 *      @see YellowAlert
 *      @see RedAlert
 */
public class GreenAlert extends AlertStatus {

    public void alert() {
        System.out.println("Status is Green");
    }
}
