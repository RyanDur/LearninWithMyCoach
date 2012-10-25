package chapter.four.exercises;

/**
 * Exercise 8:   (1) Create a class with two methods. Within the first method, call the second method twice:
 *      the first time without using this, and the second time using 'this' just to see it working; you should
 *      not use this form in practice.
 *
 *      @see ExercisesFour
 */
public class Delegation {

    /**
     * Within the first method, call the second method twice: the first time without using this, and the second time
     *      using 'this' just to see it working; you should not use this form in practice.
     *
     *      @see ExercisesFour
     */
    public void method1() {
        method2();
        this.method2();
    }

    private void method2() {
        System.out.println("I have been called");
    }

}
