package chapter.two.exercises;

import java.util.Random;

public class ExercisesTwo {
    static void f(Letter y) {
        y.c = 'z';
    }
    /**
     * <html>
     *     <head>
     *         <style TYPE="text/css">
     *             li {margin-bottom:2em;}
     *         </style>
     *     </head>
     *     <body>
     *         <ol>
     *
     *         </ol>
     *     </body>
     * </html>
     *
     */
    public static void main(String[] args) {

        /**
         * Exercise 1:   (1) Write a program that uses the short and normal form of print statement.
         */
        System.out.print("Hello");

        /**
         * Exercise 2:  (1) Create a class containing a float and use it to demonstrate aliasing.
         *  @see Alias
         */

        Alias alias = new Alias(3);
        Alias alias1 = new Alias(4);

        System.out.println("1: alias: " + alias.t + ", alias1: " + alias1.t);
        alias = alias1;
        System.out.println("2: alias: " + alias.t + ", alias1: " + alias1.t);
        alias.t = 9;
        System.out.println("3: alias: " + alias.t + ", alias1: " + alias1.t);


        /**
         * Exercise 3:  (1) Create a class containing a float and use it to demonstrate aliasing during method calls.
         *      @see Letter
         */
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("1: x.c: " + x.c);
        f(x);
        System.out.println("2: x.c: " + x.c);

        /**
         * Exercise 4:  (2) Write a program that calculates velocity using a constant distance and a constant time.
         *      @see Velocity
         */
        Velocity velocity = new Velocity();

        /**
         * Exercise 5:  (2) Create a class called Dog containing two Strings: name and says. In main( ), create two dog
         *      objects with names spot (who says, Ruff!) and scruffy (who says, Wurf!). Then display their
         *      names and what they say.
         *      @see Dog
         */

        Dog spot = new Dog("spot", "Ruff!");
        Dog scruffy = new Dog("scruffy", "Wurf!");

        spot.speak();
        scruffy.speak();

        /**
         * Exercise 6:  (3) Following Exercise 5, create a new Dog reference and assign it to spots object. Test for
         *      comparison\ using == and equals( ) for all references.
         *      @see Dog
         */
        Dog spike;

        spike = spot;
        System.out.println(spike == spot);
        System.out.println(spike.equals(spot));

        /**
         * Exercise 7:  (3) Write a program that simulates coin-flipping.
         *      @see Coin
         */

        Coin coin = new Coin();
        System.out.println(coin.flip());

        /**
         * Exercise 8:  (2) Show that hex and octal notations work with long values. Use Long.toBinaryString( ) to
         *      display the results.
         */
        long hex = 0x2f;
        long oct = 0177;
        System.out.println(Long.toBinaryString(hex));
        System.out.println(Long.toBinaryString(oct));


        /**
         * Exercise 9:  (1) Display the largest and smallest numbers for both float and double exponential notation.
         *
         */

        System.out.println(Float.MIN_EXPONENT);
        System.out.println(Float.MAX_EXPONENT);
        System.out.println(Double.MIN_EXPONENT);
        System.out.println(Double.MAX_EXPONENT);


        /**
         * Exercise 10:    (3) Write a program with two constant values, one with alternating binary ones and zeroes,
         *      with a zero in the least-significant digit, and the second, also alternating, with a one in the
         *      least-significant digit (hint: Its easiest to use hexadecimal constants for this). Take these two
         *      values and combine them in all possible ways using the bitwise operators, and display the results using
         *      Integer.toBinaryString( ).
         */
        int i = 1 + 4 + 16 + 64;
        int j = 2 + 8 + 32 + 128;
        System.out.println("i = " + Integer.toBinaryString(i));
        System.out.println("j = " + Integer.toBinaryString(j));
        System.out.println("i & j = " + Integer.toBinaryString(i & j));
        System.out.println("i | j = " + Integer.toBinaryString(i | j));
        System.out.println("i ^ j = " + Integer.toBinaryString(i ^ j));
        System.out.println("~i = " + Integer.toBinaryString(~i));
        System.out.println("~j = " + Integer.toBinaryString(~j));

        /**
         * Exercise 11:    (3) Start with a number that has a binary one in the most significant position (hint: Use a
         *      hexadecimal constant). Using the signed right-shift operator, right shift it all the way through all of
         *      its binary positions, each time displaying the result using Integer.toBinaryString( ).
         */
        int h = 0x10000000;
        System.out.println(Integer.toBinaryString(h));
        for (int k = 0; k < 28; k++) {
            h >>>= 1;
            System.out.println(Integer.toBinaryString(h));
        }

        /**
         * Exercise 12:    (3) Start with a number that is all binary ones. Left shift it, then use the unsigned
         *      right-shift operator to right shift through all of its binary positions, each time displaying the
         *      result using Integer.toBinaryString( ).
         */
        int h2 = -1;
        System.out.println(Integer.toBinaryString(h2));
        h2 <<= 10;
        System.out.println(Integer.toBinaryString(h2));
        for (int g = 0; g < 32; g++){
            h2 >>>= 1;
            System.out.println(Integer.toBinaryString(h2));
        }

        /**
         * Exercise 13:    (1) Write a method that displays char values in binary form. Demonstrate it using several
         *      different characters.
         */
        char c = 'a';
        System.out.println(Integer.toBinaryString(c));
        c = 'b';
        System.out.println(Integer.toBinaryString(c));
        c = 'c';
        System.out.println(Integer.toBinaryString(c));
        c = 'd';
        System.out.println(Integer.toBinaryString(c));
        c +=1;
        System.out.println(Integer.toBinaryString(c));
        c = 'A';
        System.out.println(Integer.toBinaryString(c));
        for(int f = 0; f < 26; f++) {
            c +=1;
            System.out.println(Integer.toBinaryString(c));
        }

        /**
         * Exercise 14:    (3) Write a method that takes two String arguments and uses all the boolean comparisons to
         *      compare the two Strings and print the results. For the == and !=, also perform the equals( ) test.
         *      In main( ), call your method with some different String objects.
         *      @see CompareString
         */
        CompareString compareString = new CompareString();

        compareString.compare("a", "a");
        compareString.compare("a", "b");
    }
}

