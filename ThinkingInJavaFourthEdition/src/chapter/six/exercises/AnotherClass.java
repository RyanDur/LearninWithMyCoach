package chapter.six.exercises;

import chapter.six.exercises.protectedpackage.AClass;

/**
 * Exercise 15:    (2) Create a class inside a package. Your class should contain a protected method. Outside of
 *       the package, try to call the protected method and explain the results. Now inherit from your class and
 *       call the protected method from inside a method of your derived class.
 *
 *       @see AClass
 *       @see ExercisesSix
 */
public class AnotherClass extends AClass {

    public void callProtectedMethod() {
        protectedMethod();
    }
}
