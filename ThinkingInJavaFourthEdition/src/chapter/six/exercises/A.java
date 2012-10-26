package chapter.six.exercises;

/**
 * Exercise 5:  (1) Create two classes, A and B, with default constructors (empty argument lists) that announce
 *      themselves. Inherit a new class called C from A, and create a member of class B inside C. Do not create
 *      a constructor for C. Create an object of class C and observe the results.
 *
 *      @see ExercisesSix
 *      @see B
 *      @see C
 */
public class A {

    /**
     * Exercise 7:  (1) Modify Exercise 5 so that A and B have constructors with arguments instead of default
     *      constructors. Write a constructor for C and perform all initialization within C’s constructor.
     *
     *      @see ExercisesSix
     *      @see B
     *      @see C
     */
    public A(int i) {
        System.out.println("A");
        System.out.println(this);
    }

    public String toString() {
        return "A";
    }
}
