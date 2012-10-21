package chapter.three.exercises;

import java.util.Random;

public class ExercisesThree {
    public static void main(String[] args) {
// Exercise 1:   (1) Write a program that prints values from 1 to 100.

        for (int i = 1; i < 101; i++) {
            System.out.println(i);
        }

// Exercise 2:  (2) Write a program that generates 25 random int values. For each value, use an if-else statement
//      to classify it as greater than, less than, or equal to a second randomly generated value.

        Random rn = new Random();
        int newInt = 0;
        int oldInt = 0;

        for (int i = 0; i < 25; i++) {
            int num = rn.nextInt();
            if (num > oldInt){
                oldInt = num;
                newInt = oldInt;
                System.out.println(num + " greater than oldInt");
            } else {
                oldInt = newInt;
                newInt = num;
                System.out.println(num + " less than oldInt");
            }
        }

// Exercise 3:  (1) Modify Exercise 2 so that your code is surrounded by an “infinite” while loop. It will then run
//      until you interrupt it from the keyboard (typically by pressing Control-C).

//        while (true) {
//            int num = rn.nextInt();
//            if (num > oldInt){
//                oldInt = num;
//                newInt = oldInt;
//                System.out.println(num + " greater than oldInt");
//            } else {
//                oldInt = newInt;
//                newInt = num;
//                System.out.println(num + " less than oldInt");
//            }
//        }

// Exercise 4:  (3) Write a program that uses two nested for loops and the modulus operator (%) to detect and print
//      prime numbers (integral numbers that are not evenly divisible by any other numbers except for themselves and 1).

        ExercisesThree exercisesThree = new ExercisesThree();
        for (int i = 1; i < 101; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.print(i + " ");
            }
        }

// Exercise 5:  (4) Repeat Exercise 10 from the previous chapter, using the ternary operator and a bitwise test to
//      display the ones and zeroes, instead of Integer.toBinaryString( ).

// Exercise 6:  (2) Modify the two test( ) methods in the previous two programs so that they take two extra arguments,
//      begin and end, and so that testval is tested to see if it is within the range between (and including) begin and
//      end.

// Exercise 7:  (1) Modify Exercise 1 so that the program exits by using the break keyword at value 99. Try using
//      return instead.

        for (int i = 1; i < 101; i++) {
            System.out.println(i);
            if (i == 99) {
                break;
            }
        }

//        for (int i = 1; i < 101; i++) {
//            System.out.println(i);
//            if (i == 99) {
//                return;
//            }
//        }

// Exercise 8:  (2) Create a switch statement that prints a message for each case, and put the switch inside a for loop
//      that tries each case. Put a break after each case and test it, then remove the breaks and see what happens.

        for (int i = 0; i < 3; i++){
            switch (i) {
                case 0:
                    System.out.println("this is i " + i);
                    break;
                case 1:
                    System.out.println("this is i " + i);
                    break;
                case 2:
                    System.out.println("this is i " + i);
            }
        }

// Exercise 9:  (4) A Fibonacci sequence is the sequence of numbers 1, 1, 2, 3, 5, 8, 13, 21, 34, and so on, where each
//      number (from the third on) is the sum of the previous two. Create a method that takes an integer as an argument
//      and displays that many Fibonacci numbers starting from the beginning, e.g., If you run java Fibonacci 5
//      (where Fibonacci is the name of the class) the output will be: 1, 1, 2, 3, 5.

        Fibonacci fib = new Fibonacci();
        fib.printFib(10);

// Exercise 10:    (5) A vampire number has an even number of digits and is formed by multiplying a pair of numbers
//      containing half the number of digits of the result. The digits are taken from the original number in any order.
//      Pairs of trailing zeroes are not allowed. Examples include:
//        1260 = 21 * 60
//        1827 = 21 * 87
//        2187 = 27 * 81
//      Write a program that finds all the 4-digit vampire numbers. (Suggested by Dan Forhan.)

    }
}

