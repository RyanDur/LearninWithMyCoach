package chapter.three.exercises;

/**
 * Exercise 9:  (4) A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21, 34, and so on,
 *      where each number (from the third on) is the sum of the previous two. Create a method that takes an
 *      integer as an argument and displays that many Fibonacci numbers starting from the beginning, e.g., If
 *      you run java Fibonacci 5 (where Fibonacci is the name of the class) the output will be: 1, 1, 2, 3, 5.
 *
 *      @see ExercisesThree
 */
public class Fibonacci {
    int i;
    int k;
    int j;

    public Fibonacci() {
        i = 0;
        k = 1;
    }

    /**
     * Create a method that takes an integer as an argument and displays that many Fibonacci numbers starting from
     *      the beginning
     *
     *      @param num
     *      @see ExercisesThree
     */
    public void printFib(int num) {
        for (int l = 0; l < num; l++) {
            System.out.println(j = i + k);
            i = k;
            k = j;
        }
    }
}
