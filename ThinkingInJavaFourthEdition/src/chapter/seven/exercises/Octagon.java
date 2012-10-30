package chapter.seven.exercises;

/**
 * Exercise 4:  (2) Add a new type of Shape to Shapes.java and verify in main( ) that polymorphism works for
 *      your new type as it does in the old types.
 *
 *      @see ExercisesSeven
 */
public class Octagon extends Shape {
    @Override
    public void draw() {
        System.out.println("Octagon.draw()");
    }
    @Override
    public void erase() {
        System.out.println("Octagon.erase()");
    }
    @Override
    public String toString() {
        return "Octagon";
    }
}
