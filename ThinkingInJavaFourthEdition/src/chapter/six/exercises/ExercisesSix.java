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

        /**
         * ...construction happens from the base “outward,” so the base class is initialized before the derived-class
         *      constructors can access it. Even if you don’t create a constructor for Cartoon( ), the compiler will
         *      synthesize a default constructor for you that calls the base-class constructor.
         *
         * Exercise 3:  (2) Prove the previous sentence.
         *
         *      @see Cartoon
         *      @see Drawing
         *      @see Art
         */
        Cartoon cartoon = new Cartoon();

        /**
         * Exercise 4:  (2) Prove that base-class constructors are (a) always called and (b) called before
         *      derived-class constructors.
         *
         *      @see Cartoon
         *      @see Drawing
         *      @see Art
         */

        /**
         * Exercise 5:  (1) Create two classes, A and B, with default constructors (empty argument lists) that announce
         *      themselves. Inherit a new class called C from A, and create a member of class B inside C. Do not create
         *      a constructor for C. Create an object of class C and observe the results.
         *
         *      @see A
         *      @see B
         *      @see C
         */
        C c = new C();

        /**
         * If you don’t call the base-class constructor in BoardGame( ), the compiler will complain that it can’t find
         *      a constructor of the form Game( ). In addition, the call to the base-class constructor must be the first
         *      thing you do in the derived-class constructor. (The compiler will remind you if you get it wrong.)
         *
         *      Exercise 6:  (1) Using Chess.java, prove the statements in the previous paragraph.
         *      @see Chess
         *      @see BoardGame
         *      @see Game
         */
        Chess chess = new Chess();

        /**
         * Exercise 7:  (1) Modify Exercise 5 so that A and B have constructors with arguments instead of default
         *      constructors. Write a constructor for C and perform all initialization within C’s constructor.
         *
         *      @see A
         *      @see B
         *      @see C
         */

        /**
         *  Exercise 8:  (1) Create a base class with only a non-default constructor, and a derived class with both a
         *      default (no-arg) and non-default constructor. In the derived-class constructors, call the
         *      base-class constructor.
         *
         *      @see MyBaseClass
         *      @see Derived
         */
        Derived derived = new Derived();

        /**
         * Exercise 9:  (2) Create a class called Root that contains an instance of each of the classes
         *      (that you also create) named Component1, Component2, and Component3. Derive a class Stem from Root that
         *      also contains an instance of each “component.” All classes should have default constructors that print
         *      a message about that class.
         *
         *      @see Root
         *      @see Stem
         *      @see Component1
         *      @see Component2
         *      @see Component3
         */
        Stem stem = new Stem("Stem");

        /**
         * Exercise 10:    (1) Modify the previous exercise so that each class only has non-default constructors.
         *
         *      @see Root
         *      @see Stem
         *      @see Component1
         *      @see Component2
         *      @see Component3
         */
    }
}


