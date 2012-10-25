package chapter.four.exercises;

import chapter.two.exercises.Dog;
import java.util.Arrays;

public class ExercisesFour {
    public static void main(String[] args) throws Throwable {

        /**
         * Exercise 1:   (1) Create a class containing an uninitialized String reference. Demonstrate that this
         *      reference is initialized by Java to null.
         *
         *      @see UninitializedString
         */
        UninitializedString uninitializedString = new UninitializedString();
        System.out.println(uninitializedString.string);


        /**
         * Exercise 2:  (2) Create a class with a String field that is initialized at the point of definition, and
         *      another one that is initialized by the constructor. What is the difference between the two approaches?
         *
         *      @see InitializedString
         */
        InitializedString initializedString = new InitializedString();
        InitializedString initializedString1 = new InitializedString("constructed");

        /**
         * Exercise 3:  (1) Create a class with a default constructor (one that takes no arguments) that prints a
         *      message. Create an object of this class.
         *
         *      @see InitializedString
         */
        InitializedString initializedString2 = new InitializedString();

        /**
         * Exercise 4:  (1) Add an overloaded constructor to the previous exercise that takes a String argument and
         *      prints it along with your message.
         *
         *      @see InitializedString
         */
        InitializedString initializedString3 = new InitializedString("constructed");

        /**
         * Exercise 5:  (2) Create a class called Dog with an overloaded bark( ) method. This method should be
         *      overloaded based on various primitive data types, and print different types of barking, howling, etc.,
         *      depending on which overloaded version is called. Write a main( ) that calls all the different versions.
         *
         *      @see Dog
         */
        Dog dog = new Dog("Sparky", "Meow");
        dog.bark();
        dog.bark("Woof");

        /**
         * Exercise 6:  (1) Modify the previous exercise so that two of the overloaded methods have two arguments
         *      (of two different types), but in reversed order relative to each other. Verify that this works.
         *      @see Dog
         */
        dog.fetch(3, "sticks");
        dog.fetch("sticks", 4);

        /**
         * Exercise 7:  (1) Create a class without a constructor, and then create an object of that class in main( ) to
         *      verify that the default constructor is automatically synthesized.
         *
         *      @see DefaultConstructor
         */
        DefaultConstructor defaultConstructor = new DefaultConstructor();

        /**
         * Exercise 8:   (1) Create a class with two methods. Within the first method, call the second method twice:
         *      the first time without using this, and the second time using 'this' just to see it working; you should
         *      not use this form in practice.
         *
         *      @see Delegation
         */
        Delegation delegation = new Delegation();
        delegation.method1();

        /**
         * Exercise 9:  (1) Create a class with two (overloaded) constructors. Using this, call the second constructor
         *      inside the first one.
         *
         *      @see OverloadedConstructor
         */
        OverloadedConstructor overloadedConstructor = new OverloadedConstructor();

        /**
         * Exercise 10:    (2) Create a class with a finalize( ) method that prints a message. In main( ), create an
         *      object of your class. Explain the behavior of your program.
         *
         *      @see FinalizedClass
         */
        FinalizedClass finalizedClass = new FinalizedClass();

        /**
         * Exercise 11:    (4) Modify the previous exercise so that your finalize( ) will always be called.
         *
         *      @see FinalizedClass
         */

        /**
         * Exercise 12:    (4) Create a class called Tank that can be filled and emptied, and has a termination
         *      condition that it must be releaseTank when the object is cleaned up. Write a finalize( ) that verifies
         *      this termination condition. In main( ), test the possible scenarios that can occur when your Tank is
         *      used.
         *
         *      @see Tank
         */
        Tank tank = new Tank();
        System.gc();

        tank.empty();
        tank.releaseTank();

        /**
         * Exercise 13:    (1) Verify the statements in the previous paragraph.
         *
         *      @see Tank
         */
        System.out.println(tank.isEmpty());

        /**
         * Exercise 14:    (1) Create a class with a static String field that is initialized at the point of definition,
         *      and another one that is initialized by the static block. Add a static method that prints both fields
         *      and demonstrates that they are both initialized before they are used.
         *
         *      @see StaticTest
         */
        StaticTest.print();

        /**
         * Exercise 15:    (1) Create a class with a String that is initialized using instance initialization.
         *
         *      @see InitializedClass
         */
        InitializedClass initializedClass = new InitializedClass();
        System.out.println(initializedClass.string);

        /**
         * Exercise 16:    (1) Create an array of String objects and assign a String to each element. Print the array
         *      by using a for loop.
         */
        String[] strings = {"string1","string2","string3","string4"};
        for (String str : strings) {
            System.out.println(str);
        }

        /**
         * Exercise 17:    (2) Create a class with a constructor that takes a String argument. During construction,
         *      print the argument. Create an array of object references to this class, but do not actually create
         *      objects to assign into the array. When you run the program, notice whether the initialization messages
         *      from the constructor calls are printed.
         *
         *      @see Messages
         */
        Messages one = null;
        Messages two = null;
        Messages[] messages = {one,two};

        /**
         * Exercise 18:    (1) Complete the previous exercise by creating objects to attach to the array of references.
         *
         *      @see Messages
         */
        messages[0] = new Messages("One");
        messages[1] = new Messages("two");

        /**
         * Exercise 19:    (2) Write a method that takes a vararg String array. Verify that you can pass either a
         *      comma-separated list of Strings or a String[] into this method.
         *
         *      @see VarArgs
         */
        VarArgs varArgs = new VarArgs();

        varArgs.printVarargs(new String[]{"Three","Four","Five"});
        String[] strings1 = new String[]{"Six","Seven","Eight"};
        varArgs.printVarargs(strings1);

        /**
         * Exercise 20:   (1) Create a main( ) that uses varargs instead of the ordinary main( ) syntax. Print all the
         *      elements in the resulting args array. Test it with various numbers of command-line arguments.
         */
        for (String string : args) {
            System.out.println(string);
        }

        /**
         * Exercise 21:    (1) Create an enum of the least-valuable six types of paper currency. Loop through the
         *      values( ) and print each value and its ordinal( ).
         *
         *      @see Money
         */
        for (Money s : Money.values()) {
            System.out.println(s + ", ordinal " + s.ordinal());
        }

        String[] st = {"a", "e", "i", "o", "u"};
        for (String s : st) {
            System.out.println(s + ", toUppercase " + s.toUpperCase());
        }

        System.out.println(Arrays.toString(st));

        /**
         * Exercise 22:   (2) Write a switch statement for the enum in the previous example. For each case, output a
         *      description of that particular currency.
         *
         *      @see Money
         */
        for (Money m : Money.values()) {
            m.choose(m);
        }
    }
}



