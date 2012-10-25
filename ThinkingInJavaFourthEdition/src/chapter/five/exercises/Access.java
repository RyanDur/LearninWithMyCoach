package chapter.five.exercises;

/**
 * Exercise 5:  (2) Create a class with public, private, protected, and package-access fields and method
 *      members. Create an object of this class and see what kind of compiler messages you get when you try to
 *      access all the class members. Be aware that classes in the same directory are part of the default
 *      package.
 *      @see ExercisesFive
 */
public class Access {

    public String a = "Public";
    String b = "Package";
    protected String c = "Protected";
    private String d = "private";
}
