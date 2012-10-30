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
     *
     *             <li>Exercise 6:  (1) Change Music3.java so that what( ) becomes the root Object method toString( ).
     *             Try printing the Instrument objects using System.out.println( ) (without any casting).</li>
     *
     *             <li>Exercise 7:  (2) Add a new type of Instrument to Music3.java and verify that polymorphism works
     *             for your new type.</li>
     *
     *             <li>Exercise 8:  (2) Modify Music3.java so that it randomly creates Instrument objects the way
     *             Shapes.java does.</li>
     *
     *             <li>Exercise 9:  (3) Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster, etc. In the
     *             base class, provide methods that are common to all Rodents, and override these in the derived
     *             classes to perform different behaviors depending on the specific type of Rodent. Create an array of
     *             Rodent, fill it with different specific types of Rodents, and call your base-class methods to see
     *             what happens.</li>
     *
     *             <li>Exercise 10:    (3) Create a base class with two methods. In the first method, call the second
     *             method. Inherit a class and override the second method. Create an object of the derived class,
     *             upcast it to the base type, and call the first method. Explain what happens.</li>
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
         * Exercise 3:  (1) Add a new method in the base class of Shapes.java that prints a message, but do not
         *      override it in the derived classes. Explain what happens. Now override it in one of the derived
         *      classes but not the others, and see what happens. Finally, override it in all the derived classes.
         *
         *      @see Shape
         *      @see Circle
         *      @see Square
         *      @see Triangle
         */

        /**
         * Exercise 4:  (2) Add a new type of Shape to Shapes.java and verify in main( ) that polymorphism works for
         *      your new type as it does in the old types.
         *
         *      @see Octagon
         */
        Shape octagon = new Octagon();
        System.out.println(octagon);

        /**
         * Exercise 5:  (1) Starting from Exercise 1, add a wheels( ) method in Cycle, which returns the number of
         *      wheels. Modify ride( ) to call wheels( ) and verify that polymorphism works.
         *
         *      @see Cycle
         *      @see Tricycle
         *      @see UniCycle
         */

        /**
         * Exercise 6:  (1) Change Music3.java so that what( ) becomes the root Object method toString( ). Try printing
         *      the Instrument objects using System.out.println( ) (without any casting).
         *
         *      @see Wind
         *      @see Percussion
         *      @see Stringed
         *      @see Brass
         *      @see Woodwind
         */
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind(),
                new Reed()
        };
        Music3.tuneAll(orchestra);
        for (Instrument instrument : orchestra) {
            System.out.println(instrument.what());
        }

        /**
         * Exercise 7:  (2) Add a new type of Instrument to Music3.java and verify that polymorphism works for your new
         *      type.
         *
         *      @see Reed
         */

        /**
         * Exercise 8:  (2) Modify Music3.java so that it randomly creates Instrument objects the way Shapes.java does.
         *
         *      @see Instruments
         *      @see RandomInstrumentGenerator
         */
        Instrument[] instruments = new Instrument[9];
        for(int i = 0; i < s.length; i++) {
            instruments[i] = Instruments.instrumentGenerator.next();
            System.out.println(instruments[i]);
        }

//        Exercise 9:  (3) Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster, etc. In the base class,
//              provide methods that are common to all Rodents, and override these in the derived classes to perform
//              different behaviors depending on the specific type of Rodent. Create an array of Rodent, fill it with
//              different specific types of Rodents, and call your base-class methods to see what happens.

//        Exercise 10:    (3) Create a base class with two methods. In the first method, call the second method.
//              Inherit a class and override the second method. Create an object of the derived class, upcast it to
//              the base type, and call the first method. Explain what happens.
    }
}

