package chapter.four.exercises;

/**
 * Exercise 14:    (1) Create a class with a static String field that is initialized at the point of definition,
 *      and another one that is initialized by the static block. Add a static method that prints both fields
 *      and demonstrates that they are both initialized before they are used.
 *
 *      @see ExercisesFour
 */
public class StaticTest {

    static String str = "string";
    static String str2;

    static {str2 = "47";}

    public static void print() {
        System.out.println(str);
        System.out.println(str2);
    }

}
