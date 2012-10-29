package chapter.one.exercises;

import java.util.Date;

/**
 * Exercise 6:  (2) Write a program that includes and calls the storage( ) method defined as a code fragment in
 *      this chapter.
 */
public class ExercisesOne {

    int storage(String s) {
        return s.length() * 2;
    }

    static int i = 47;

    /**
     * <html>
     *     <head>
     *         <style TYPE="text/css">
     *             li {margin-bottom:2em;}
     *         </style>
     *     </head>
     *     <body>
     *         <ol>
     *             <li>Exercise 1:   (2) Create a class containing an int and a char that are not initialized, and
     *                  print their values to verify that Java performs default initialization.</li>
     *
     *             <li>Exercise 2:  (1) Following the HelloDate.java example in this chapter, create a hello, world
     *                  program that simply displays that statement. You need only a single method in your class
     *                  (the main one that gets executed when the program starts). Remember to make it static and to
     *                  include the argument list, even though you do not use the argument list. Compile the program
     *                  with javac and run it using java. If you are using a different development environment than
     *                  the JDK, learn how to compile and run programs in that environment.</li>
     *
     *             <li>Exercise 3:  (1) Find the code fragments involving ATypeName and turn them into a program that
     *                  compiles and runs.</li>
     *
     *             <li>Exercise 4:  (1) Turn the DataOnly code fragments into a program that compiles and runs.</li>
     *
     *             <li>Exercise 5:  (1) Modify the previous exercise so that the values of the data in DataOnly are
     *                  assigned to and printed in main( ).</li>
     *
     *             <li>Exercise 6:  (2) Write a program that includes and calls the storage( ) method defined as a code
     *                  fragment in this chapter.</li>
     *
     *             <li>Exercise 7:  (1) Turn the Incrementable code fragments into a working program.</li>
     *
     *             <li>Exercise 8:  (3) Write a program that demonstrates that, no matter how many objects you create
     *                  of a particular class, there is only one instance of a particular static field in that
     *                  class.</li>
     *
     *             <li>Exercise 9:  (2) Write a program that demonstrates that autoboxing works for all the primitive
     *                  types and their wrappers.</li>
     *
     *             <li>Exercise 10:    (2) Write a program that prints three arguments taken from the command line. To
     *                  do this, you will need to index into the command-line array of Strings.</li>
     *
     *             <li>Exercise 11:    (1) Turn the AllTheColorsOfTheRainbow example into a program that compiles and
     *                  runs.</li>
     *
     *             <li>Exercise 13:    (1) Run Documentation1.java, Documentation2.java, and Documentation3.java
     *                  through Javadoc. Verify the resulting documentation with your Web browser.</li>
     *
     *             <li>Exercise 14:    (1) Add an HTML list of items to the documentation in the previous exercise.</li>
     *
     *             <li>Exercise 15:    (1) Take the program in Exercise 2 and add comment documentation to it. Extract
     *                  this comment documentation into an HTML file using Javadoc and view it with your Web
     *                  browser.</li>
     *
     *             <li>Exercise 16:    (1) In the Initialization & Cleanup chapter, locate the Overloading.java example
     *                  and add Javadoc documentation. Extract this comment documentation into an HTML file using
     *                  Javadoc and view it with your Web  browser.</li>
     *         </ol>
     *     </body>
     * </html>
     *
     */

    public static void main(String[] args) {

        /**
        * Exercise 1:   (2) Create a class containing an int and a char that are not initialized, and print their
        *      values to verify that Java performs default initialization.
        *
        *      @see One
        */
        One one = new One();
        System.out.println(one.a);
        System.out.println(one.ch);

        /**
         * Exercise 2:  (1) Following the HelloDate.java example in this chapter, create a hello, world program that
         *      simply displays that statement. You need only a single method in your class (the main one that gets
         *      executed when the program starts). Remember to make it static and to include the argument list, even
         *      though you do not use the argument list. Compile the program with javac and run it using java. If you
         *      are using a different development environment than the JDK, learn how to compile and run programs in
         *      that environment.
         *
         *      @see HelloWorld
         */
        HelloWorld helloWorld = new HelloWorld(4);

        /**
         * Exercise 3:  (1) Find the code fragments involving ATypeName and turn them into a program that compiles and
         *      runs.
         *
         *      @see ATypeName
         */
        ATypeName a = new ATypeName();

        /**
         * Exercise 4:  (1) Turn the DataOnly code fragments into a program that compiles and runs.
         *
         *      @see DataOnly
         */
        DataOnly data = new DataOnly();

        /**
         * Exercise 5:  (1) Modify the previous exercise so that the values of the data in DataOnly are assigned to and
         *      printed in main( ).
         *
         *      @see DataOnly
         */
        data.i = 47;
        data.d = 1.1;
        data.b = false;

        System.out.println(data.i);
        System.out.println(data.d);
        System.out.println(data.b);

        /**
         * Exercise 6:  (2) Write a program that includes and calls the storage( ) method defined as a code fragment in
         *      this chapter.
         *
         *      @see ExercisesOne
         */
        ExercisesOne exercisesOne = new ExercisesOne();
        System.out.println(exercisesOne.storage("four"));

        /**
         * Exercise 7:  (1) Turn the Incrementable code fragments into a working program.
         *
         *      @see Incrementable
         */
        Incrementable sf = new Incrementable();
        sf.increment();
        Incrementable.increment();

        System.out.println(ExercisesOne.i);

        /**
         * Exercise 8:  (3) Write a program that demonstrates that, no matter how many objects you create of a
         *      particular class, there is only one instance of a particular static field in that class.
         *
         *      @see Incrementable
         */
        Incrementable sf1 = new Incrementable();
        sf1.increment();
        System.out.println(ExercisesOne.i);
        Incrementable sf2 = new Incrementable();
        sf2.increment();
        Incrementable sf3 = new Incrementable();
        sf3.increment();
        System.out.println(ExercisesOne.i);

        /**
         * Exercise 9:  (2) Write a program that demonstrates that autoboxing works for all the primitive types and
         *      their wrappers.
         */
        int i = 1;
        Integer I;
        I = i;
        System.out.println(I);

        boolean b = true;
        Boolean B;
        B = b;
        System.out.println(B);

        char ch = 'c';
        Character Ch;
        Ch = ch;
        System.out.println(Ch);

        byte by = 3;
        Byte By;
        By = by;
        System.out.println(By);

        short sh = 6;
        Short Sh;
        Sh = sh;
        System.out.println(Sh);

        long l = 9;
        Long L;
        L = l;
        System.out.println(L);

        float f = (float) 1.1;
        Float F;
        F = f;
        System.out.println(F);

        double d = 3.4;
        Double D;
        D = d;
        System.out.println(D);

        /**
         * Exercise 10:    (2) Write a program that prints three arguments taken from the command line. To do this, you
         *      will need to index into the command-line array of Strings.
         */

        /**
         * Exercise 11:    (1) Turn the AllTheColorsOfTheRainbow example into a program that compiles and runs.
         *
         *      @see AllTheColorsOfTheRainbow
         */

        /**
         * Exercise 13:    (1) Run Documentation1.java, Documentation2.java, and Documentation3.java through Javadoc.
         *      Verify the resulting documentation with your Web browser.
         */

        /**
         * Exercise 14:    (1) Add an HTML list of items to the documentation in the previous exercise.
         */

        /**
         * Exercise 15:    (1) Take the program in Exercise 2 and add comment documentation to it. Extract this comment
         *      documentation into an HTML file using Javadoc and view it with your Web browser.
         */

        /**
         * Exercise 16:    (1) In the Initialization & Cleanup chapter, locate the Overloading.java example and add
         *      Javadoc documentation. Extract this comment documentation into an HTML file using Javadoc and view it
         *      with your Web  browser.
         */
    }
}
