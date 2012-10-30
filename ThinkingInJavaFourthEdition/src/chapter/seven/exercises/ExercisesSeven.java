package chapter.seven.exercises;

import java.util.Random;

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
     *
     *             <li>Exercise 2:  (1) Add the @Override annotation to the shapes example.</li>
     *
     *             <li>Exercise 3:  (1) Add a new method in the base class of Shapes.java that prints a message, but
     *             do not override it in the derived classes. Explain what happens. Now override it in one of the
     *             derived classes but not the others, and see what happens. Finally, override it in all the derived
     *             classes.</li>
     *
     *             <li>Exercise 4:  (2) Add a new type of Shape to Shapes.java and verify in main( ) that polymorphism
     *             works for your new type as it does in the old types.</li>
     *
     *             <li>Exercise 5:  (1) Starting from Exercise 1, add a wheels( ) method in Cycle, which returns the
     *             number of wheels. Modify ride( ) to call wheels( ) and verify that polymorphism works.</li>
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

        /**
         * Exercise 2:  (1) Add the @Override annotation to the shapes example.
         *
         *      @see Shapes
         *      @see RandomShapeGenerator
         *      @see Shape
         *      @see Triangle
         *      @see Square
         *      @see Circle
         */
        Shape[] s = new Shape[9];

        for(int i = 0; i < s.length; i++) {
            s[i] = Shapes.gen.next();
            System.out.println(s[i]);
        }

        for(Shape shp : s) {
            shp.draw();
        }

        /**
         *   Exercise 3:  (1) Add a new method in the base class of Shapes.java that prints a message, but do not
         *        override it in the derived classes. Explain what happens. Now override it in one of the derived
         *        classes but not the others, and see what happens. Finally, override it in all the derived classes.
         *
         *        @see Shape
         *        @see Circle
         *        @see Square
         *        @see Triangle
         */

        /**
         * Exercise 4:  (2) Add a new type of Shape to Shapes.java and verify in main( ) that polymorphism works for
         *      your new type as it does in the old types.
         *
         *      @see Octagon
         */
        Shape octagon = new Octagon();
        System.out.println(octagon);

//        Exercise 5:  (1) Starting from Exercise 1, add a wheels( ) method in Cycle, which returns the number of
//              wheels. Modify ride( ) to call wheels( ) and verify that polymorphism works.
    }
}

