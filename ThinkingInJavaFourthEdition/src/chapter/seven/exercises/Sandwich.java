package chapter.seven.exercises;

/**
 * Exercise 11:    (1) Add class Pickle to Sandwich.java
 *
 *      @see Meal
 *      @see Bread
 *      @see Cheese
 *      @see Lettuce
 *      @see Pickle
 *      @see Lunch
 *      @see ExercisesSeven
 *      @see PortableLunch
 */
public class Sandwich extends PortableLunch {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    private Pickle p = new Pickle();
    public Sandwich() {
        System.out.println("Sandwich()");
    }
}
