package chapter.six.exercises;


import sun.java2d.pipe.SpanShapeRenderer;

public class ExercisesSix {
    public static void main(String[] args) {
        /**
         * Exercise 1:   (2) Create a simple class. Inside a second class, define a reference to an object of the first
         *      class. Use lazy initialization to instantiate this object.
         *
         *      @see SimpleClass
         *      @see LazyClass
         */
        SimpleClass simple = new SimpleClass();

        /**
         * Exercise 2:  (2) Inherit a new class from class Detergent. Override scrub( ) and add a new method called
         *      sterilize( ).
         *
         *      @see Tide
         *      @see Detergent
         *      @see Cleanser
         */
        Tide tide = new Tide();
        tide.dilute();
        tide.apply();
        tide.scrub();
        tide.foam();
        tide.sterilize();
        System.out.println(tide);

//        Exercise 3:  (2) Prove the previous sentence.
//
//        Exercise 4:  (2) Prove that base-class constructors are (a) always called and (b) called before derived-class
//              constructors.
//
//        Exercise 5:  (1) Create two classes, A and B, with default constructors (empty argument lists) that announce
//              themselves. Inherit a new class called C from A, and create a member of class B inside C. Do not create
//              a constructor for C. Create an object of class C and observe the results.

    }
}

