package chapter.seven.exercises;

/**
 * Exercise 2:  (1) Add the @Override annotation to the shapes example.
 *
 *      @see Shapes
 *      @see RandomShapeGenerator
 *      @see Shape
 *      @see Triangle
 *      @see ExercisesSeven
 *      @see Circle
 */
public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }
    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }

    /**
     *   Exercise 3:  (1) Add a new method in the base class of Shapes.java that prints a message, but do not
     *          override it in the derived classes. Explain what happens. Now override it in one of the derived
     *          classes but not the others, and see what happens. Finally, override it in all the derived classes.
     *
     *          @see Shape
     *          @see Circle
     *          @see ExercisesSeven
     *          @see Triangle
     */
    @Override
    public String toString() {
        return "Square";
    }
}
