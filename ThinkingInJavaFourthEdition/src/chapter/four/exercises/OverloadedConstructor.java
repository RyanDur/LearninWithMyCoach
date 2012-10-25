package chapter.four.exercises;

/**
 * Exercise 9:  (1) Create a class with two (overloaded) constructors. Using this, call the second constructor
 *      inside the first one.
 *
 *      @see ExercisesFour
 */
public class OverloadedConstructor {

    /**
     * Using this, call the second constructor inside the first one.
     *
     * @see ExercisesFour
     */
    public OverloadedConstructor() {
        this(1, "2");
    }

    public OverloadedConstructor(int num, String str){
        System.out.println(num+str);
    }

}
