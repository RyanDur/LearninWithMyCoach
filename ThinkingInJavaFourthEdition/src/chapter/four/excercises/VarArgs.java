package chapter.four.excercises;

/**
 * Exercise 19:    (2) Write a method that takes a vararg String array. Verify that you can pass either a
 *      comma-separated list of Strings or a String[] into this method.
 *
 *      @see ExcercisesFour
 */
public class VarArgs {

    public void printVarargs(String[] strings) {
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
