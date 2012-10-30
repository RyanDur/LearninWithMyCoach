package chapter.seven.exercises;

/**
 * Exercise 10:    (3) Create a base class with two methods. In the first method, call the second method.
 *      Inherit a class and override the second method. Create an object of the derived class, upcast it to
 *      the base type, and call the first method. Explain what happens.
 *
 *      @see DerivedClass1
 *      @see ExercisesSeven
 */
public class BaseClass1 {
    public void method1() {
        System.out.println("BaseClass1");
        method2();
    }

    public void method2() {
        System.out.println("BaseClass1");
    }
}
