package chapter.seven.exercises;

/**
 * Exercise 2:  (1) Add the @Override annotation to the shapes example.
 *
 *      @see Shapes
 *      @see RandomShapeGenerator
 *      @see Shape
 *      @see ExercisesSeven
 *      @see Square
 *      @see Circle
 */
public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }
    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }

    /**
     *   Exercise 3:  (1) Add a new method in the base class of Shapes.java that prints a message, but do not
     *          override it in the derived classes. Explain what happens. Now override it in one of the derived
     *          classes but not the others, and see what happens. Finally, override it in all the derived classes.
     *
     *          @see Shape
     *          @see Circle
     *          @see Square
     *          @see ExercisesSeven
     */
    @Override
    public String toString() {
        return "Triangle";
    }
}
