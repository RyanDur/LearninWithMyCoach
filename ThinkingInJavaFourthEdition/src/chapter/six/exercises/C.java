package chapter.six.exercises;

/**
 * Exercise 5:  (1) Create two classes, A and B, with default constructors (empty argument lists) that announce
 *      themselves. Inherit a new class called C from A, and create a member of class B inside C. Do not create
 *      a constructor for C. Create an object of class C and observe the results.
 *
 *      @see A
 *      @see B
 *      @see ExercisesSix
 */
public class C extends B {

    public String toString() {
        return "C";
    }
}
