package chapter.seven.exercises;

/**
 * Exercise 1:   (2) Create a Cycle class, with subclasses UniCycle, Bicycle and Tricycle. Demonstrate that an
 *      instance of each type can be upcast to Cycle via a ride( ) method.
 *
 *      @see ExercisesSeven
 *      @see UniCycle
 *      @see Tricycle
 */
public class Cycle {

    /**
     * Exercise 5:  (1) Starting from Exercise 1, add a wheels( ) method in Cycle, which returns the number of
     *      wheels. Modify ride( ) to call wheels( ) and verify that polymorphism works.
     *
     *      @see ExercisesSeven
     *      @see Tricycle
     *      @see UniCycle
     */
    public void ride(Cycle cycle) {
        System.out.println("I am riding a " + cycle);
        System.out.println("The number of wheels it has is " + cycle.wheels());
    }

    public int wheels() {
        return 0;
    }
}
