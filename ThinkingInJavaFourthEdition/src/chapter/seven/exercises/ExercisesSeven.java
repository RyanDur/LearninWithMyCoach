package chapter.seven.exercises;

public class ExercisesSeven {
    /**
     * <html>
     *     <head>
     *         <style TYPE="text/css">
     *              li {margin-bottom:2em;}
     *         </style>
     *     </head>
     *     <body>
     *         <ol>
     *             <li>Exercise 1:   (2) Create a Cycle class, with subclasses UniCycle, Bicycle and Tricycle.
     *             Demonstrate that an instance of each type can be upcast to Cycle via a ride( ) method.</li>
     *         </ol>
     *     </body>
     * </html>
     *
     */
    public static void main(String[] args) {

        /**
         * Exercise 1:   (2) Create a Cycle class, with subclasses UniCycle, Bicycle and Tricycle. Demonstrate that an
         *      instance of each type can be upcast to Cycle via a ride( ) method.
         *
         *      @see Cycle
         *      @see UniCycle
         *      @see Tricycle
         */
        Cycle cycle = new Cycle();
        UniCycle uniCycle = new UniCycle();
        Tricycle tricycle = new Tricycle();

        cycle.ride(uniCycle);
        cycle.ride(tricycle);
    }
}
