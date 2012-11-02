package chapter.seven.exercises;

/**
 * Exercise 1:   (2) Create a Cycle class, with subclasses UniCycle, Bicycle and Tricycle. Demonstrate that an
 *      instance of each type can be upcast to Cycle via a ride( ) method.
 *
 *      @see ExercisesSeven
 *      @see UniCycle
 *      @see Bicycle
 *      @see Tricycle
 */
public class Cycle {

    /**
     * Exercise 5:  (1) Starting from Exercise 1, add a wheels( ) method in Cycle, which returns the number of
     *      wheels. Modify ride( ) to call wheels( ) and verify that polymorphism works.
     *
     *      @see ExercisesSeven
     *      @see Tricycle
     *      @see Bicycle
     *      @see UniCycle
     */
    public void ride(Cycle cycle) {
        System.out.println("I am riding a " + cycle);
        System.out.println("The number of wheels it has is " + cycle.wheels());
    }

    /**
     * Exercise 5:  (1) Starting from Exercise 1, add a wheels( ) method in Cycle, which returns the number of
     *      wheels. Modify ride( ) to call wheels( ) and verify that polymorphism works.
     *
     *      @see ExercisesSeven
     *      @see Tricycle
     *      @see Bicycle
     *      @see UniCycle
     */
    public int wheels() {
        return 0;
    }

    /**
     * Exercise 17:    (2) Using the Cycle hierarchy from Exercise 1, add a balance( ) method to Unicycle and
     *      Bicycle, but not to Tricycle. Create instances of all three types and upcast them to an array of Cycle.
     *      Try to call balance( ) on each element of the array and observe the results. Downcast and call
     *      balance( ) and observe what happens.
     *
     *      @see ExercisesSeven
     *      @see UniCycle
     *      @see Bicycle
     */
    public void balance() {}
}
