package chapter.six.exercises.protectedpackage;

/**
 * Exercise 15:    (2) Create a class inside a package. Your class should contain a protected method. Outside of
 *       the package, try to call the protected method and explain the results. Now inherit from your class and
 *       call the protected method from inside a method of your derived class.
 *
 *       @see chapter.six.exercises.ExercisesSix
 *       @see chapter.six.exercises.AnotherClass
 */
public class AClass {

    protected void protectedMethod() {
        System.out.println("protectedMethod in " + this);
    }

    public String toString() {
        return "AClass";
    }
}
