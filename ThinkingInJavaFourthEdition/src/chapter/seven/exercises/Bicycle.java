package chapter.seven.exercises;

/**
 * Exercise 1:   (2) Create a Cycle class, with subclasses UniCycle, Bicycle and Tricycle. Demonstrate that an
 *      instance of each type can be upcast to Cycle via a ride( ) method.
 *
 *      @see Cycle
 *      @see UniCycle
 *      @see ExercisesSeven
 *      @see Tricycle
 */
public class Bicycle extends Cycle{
    public String toString() {
        return "Bicycle";
    }

    /**
     * Exercise 5:  (1) Starting from Exercise 1, add a wheels( ) method in Cycle, which returns the number of
     *      wheels. Modify ride( ) to call wheels( ) and verify that polymorphism works.
     *
     *      @see Cycle
     *      @see Tricycle
     *      @see ExercisesSeven
     *      @see UniCycle
     */
    public int wheels() {
        return 2;
    }

    /**
     * Exercise 17:    (2) Using the Cycle hierarchy from Exercise 1, add a balance( ) method to Unicycle and
     *      Bicycle, but not to Tricycle. Create instances of all three types and upcast them to an array of Cycle.
     *      Try to call balance( ) on each element of the array and observe the results. Downcast and call
     *      balance( ) and observe what happens.
     *
     *      @see Cycle
     *      @see UniCycle
     *      @see Bicycle
     */
    public void balance() {
        System.out.println("Balancing on " + this);
    }
}
