package chapter.six.exercises;

/**
 * Exercise 9:  (2) Create a class called Root that contains an instance of each of the classes
 *      (that you also create) named Component1, Component2, and Component3. Derive a class Stem from Root that
 *      also contains an instance of each “component.” All classes should have default constructors that print
 *      a message about that class.
 *
 *      @see ExercisesSix
 *      @see Stem
 *      @see Component1
 *      @see Component2
 *      @see Component3
 */
public class Root {
    Component1 component1 = new Component1(1);
    Component2 component2 = new Component2(2);
    Component3 component3 = new Component3(3);

    /**
     * Exercise 10:    (1) Modify the previous exercise so that each class only has non-default constructors.
     *
     *      @see ExercisesSix
     *      @see Stem
     *      @see Component1
     *      @see Component2
     *      @see Component3
     */
    public Root(String string) {
        System.out.println("Root");
    }

}
