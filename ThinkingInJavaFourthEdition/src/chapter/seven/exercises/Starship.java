package chapter.seven.exercises;

/**
 * Exercise 16:    (3) Following the example in Transmogrify.java, create a Starship class containing an
 *      AlertStatus reference that can indicate three different states. Include methods to change the states.
 *
 *      @see ExercisesSeven
 *      @see AlertStatus
 *      @see GreenAlert
 *      @see YellowAlert
 *      @see RedAlert
 */
public class Starship {
    private static int i = 0;

    private AlertStatus alertStatus = new GreenAlert();

    public void status() {
        alertStatus.alert();
    }
    public void changeStatus() {
        if (i++ % 2 == 0) {
            alertStatus = new YellowAlert();
        } else {
            alertStatus = new RedAlert();
        }
    }
}
