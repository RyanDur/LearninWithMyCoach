package chapter.seven.exercises;

import chapter.six.exercises.Derived;

import java.awt.event.MouseAdapter;
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
     *
     *             <li>Exercise 11:    (1) Add class Pickle to Sandwich.java</li>
     *
     *             <li>Exercise 12:    (3) Modify Exercise 9 so that it demonstrates the order of initialization of the
     *             base classes and derived classes. Now add member objects to both the base and derived classes, and
     *             show the order in which their initialization occurs during construction.</li>
     *
     *             <li>//        Exercise 13:    (3) Add a finalize( ) method to ReferenceCounting.java to verify the
     *             termination condition (see the Initialization & Cleanup chapter).</li>
     *
     *             <li>Exercise 14:    (4) Modify Exercise 12 so that one of the member objects is a shared object with
     *             reference counting, and demonstrate that it works properly.</li>
     *
     *             <li>Exercise 15:    (2) Add a RectangularGlyph to PolyConstructors.java and demonstrate the problem
     *             described in this section.</li>
     *
     *             <li>Exercise 16:    (3) Following the example in Transmogrify.java, create a Starship class
     *             containing an AlertStatus reference that can indicate three different states. Include methods to
     *             change the states.</li>
     *
     *             <li>Exercise 17:    (2) Using the Cycle hierarchy from Exercise 1, add a balance( ) method to
     *             Unicycle and Bicycle, but not to Tricycle. Create instances of all three types and upcast them to an
     *             array of Cycle. Try to call balance( ) on each element of the array and observe the results.
     *             Downcast and call balance( ) and observe what happens.</li>
     *         </ol>
     *     </body>
     * </html>
     *
     */
    public static void main(String[] args) throws Throwable {

        /**
         * Exercise 1:   (2) Create a Cycle class, with subclasses UniCycle, Bicycle and Tricycle. Demonstrate that an
         *      instance of each type can be upcast to Cycle via a ride( ) method.
         *
         *      @see Cycle
         *      @see UniCycle
         *      @see Bicycle
         *      @see Tricycle
         */
        Cycle cycle = new Cycle();
        UniCycle uniCycle = new UniCycle();
        Tricycle tricycle = new Tricycle();
        Bicycle bicycle = new Bicycle();

        cycle.ride(uniCycle);
        cycle.ride(tricycle);
        cycle.ride(bicycle);

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
         *      @see Bicycle
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
         *      @see Instrument
         *      @see Music3
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

        /**
         * Exercise 9:  (3) Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster, etc. In the base class,
         *      provide methods that are common to all Rodents, and override these in the derived classes to perform
         *      different behaviors depending on the specific type of Rodent. Create an array of Rodent, fill it with
         *      different specific types of Rodents, and call your base-class methods to see what happens.
         *
         *      @see Rodent
         *      @see Hamster
         *      @see Gerbil
         *      @see Mouse
         */
        Rodent[] rodents = {new Mouse(), new Gerbil(), new Hamster()};

        for (Rodent rodent : rodents) {
            rodent.move();
            rodent.gnaw();
        }

        /**
         * Exercise 10:    (3) Create a base class with two methods. In the first method, call the second method.
         *      Inherit a class and override the second method. Create an object of the derived class, upcast it to
         *      the base type, and call the first method. Explain what happens.
         *
         *      @see DerivedClass1
         *      @see BaseClass1
         */
        BaseClass1 derivedClass1 = new DerivedClass1();
        derivedClass1.method1();

        /**
         * Exercise 11:    (1) Add class Pickle to Sandwich.java
         *
         *      @see Meal
         *      @see Bread
         *      @see Cheese
         *      @see Lettuce
         *      @see Pickle
         *      @see Lunch
         *      @see Sandwich
         *      @see PortableLunch
         */
        new Sandwich();


        /**
         * Exercise 12:    (3) Modify Exercise 9 so that it demonstrates the order of initialization of the base classes
         *      and derived classes. Now add member objects to both the base and derived classes, and show the order in
         *      which their initialization occurs during construction.
         *
         *      @see Rodent
         *      @see Hamster
         *      @see Mouse
         *      @see Gerbil
         *      @see Instrument
         *      @see Stringed
         *      @see Reed
         *      @see Brass
         *      @see Percussion
         */
        for (Rodent rodent : rodents) {
            rodent.dispose();
        }

        /**
         * Exercise 13:    (3) Add a finalize( ) method to ReferenceCounting.java to verify the termination condition
         *      (see the Initialization & Cleanup chapter).
         *
         *      @see ReferenceCounting
         *      @see Shared
         *      @see Composing
         */
        new ReferenceCounting();

        /**
         * Exercise 14:    (4) Modify Exercise 12 so that one of the member objects is a shared object with reference
         *      counting, and demonstrate that it works properly.
         *      @see Instrument
         */

        /**
         * Exercise 15:    (2) Add a RectangularGlyph to PolyConstructors.java and demonstrate the problem described in
         *      this section.
         *
         *      @see Glyph
         *      @see PolyConstructors
         *      @see RoundGlyph
         *      @see RectangularGlyph
         */
        new PolyConstructors();

        /**
         * Exercise 16:    (3) Following the example in Transmogrify.java, create a Starship class containing an
         *      AlertStatus reference that can indicate three different states. Include methods to change the states.
         *
         *      @see Starship
         *      @see AlertStatus
         *      @see GreenAlert
         *      @see YellowAlert
         *      @see RedAlert
         */
        Starship starship = new Starship();
        starship.status();
        starship.changeStatus();
        starship.status();
        starship.changeStatus();
        starship.status();
        starship.changeStatus();
        starship.status();

        /**
         * Exercise 17:    (2) Using the Cycle hierarchy from Exercise 1, add a balance( ) method to Unicycle and
         *      Bicycle, but not to Tricycle. Create instances of all three types and upcast them to an array of Cycle.
         *      Try to call balance( ) on each element of the array and observe the results. Downcast and call
         *      balance( ) and observe what happens.
         *
         *      @see Cycle
         *      @see UniCycle
         *      @see Bicycle
         */
        Cycle[] cycles = {new UniCycle(),new Bicycle(),new Tricycle()};
        for (Cycle cycle1 : cycles) {
            cycle1.balance();
        }
    }
}

