package chapter.two.exercises;

/**
 * Exercise 14:    (3) Write a method that takes two String arguments and uses all the boolean comparisons to
 *      compare the two Strings and print the results. For the == and !=, also perform the equals( ) test.
 *      In main( ), call your method with some different String objects.
 *      @see ExercisesTwo
 */
public class CompareString {

    public void compare(String a, String b) {
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a.equals(b));
        System.out.println(b.equals(a));
    }
}
