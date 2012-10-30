package chapter.seven.exercises;

/**
 * Exercise 2:  (1) Add the @Override annotation to the shapes example.
 *
 *      @see Shapes
 *      @see RandomShapeGenerator
 *      @see Shape
 *      @see Triangle
 *      @see Square
 *      @see ExercisesSeven
 */
public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }
    @Override
    public void erase() {
        System.out.println("Circle.erase()");
    }

    /**
     *   Exercise 3:  (1) Add a new method in the base class of Shapes.java that prints a message, but do not
     *          override it in the derived classes. Explain what happens. Now override it in one of the derived
     *          classes but not the others, and see what happens. Finally, override it in all the derived classes.
     *
     *          @see Shape
     *          @see ExercisesSeven
     *          @see Square
     *          @see Triangle
     */
    @Override
    public String toString() {
        return "Circle";
    }
}
