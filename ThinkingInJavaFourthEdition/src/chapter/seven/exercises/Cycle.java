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

    public void ride(Cycle cycle) {
        System.out.println("I am riding a " + cycle);
    }
}
