package chapter.six.exercises;

/**
 * Exercise 16:    (2) Create a class called Amphibian. From this, inherit a class called Frog. Put appropriate
 *      methods in the base class. In main( ), create a Frog and upcast it to Amphibian, and demonstrate that
 *      all the methods still work.
 *
 *      @see ExercisesSix
 *      @see Frog
 */
public class Amphibian {

    public void print(Amphibian amphibian) {
        System.out.println(amphibian);
    }

    /**
     * Exercise 17:    (1) Modify Exercise 16 so that Frog overrides the method definitions from the base class
     *      (provides new definitions using the same method signatures). Note what happens in main( ).
     *
     *      @see ExercisesSix
     *      @see Frog
     */
    public void method() {
        System.out.println("Hello");
    }
}
