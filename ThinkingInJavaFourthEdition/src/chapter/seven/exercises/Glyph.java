package chapter.seven.exercises;

/**
 * Exercise 15:    (2) Add a RectangularGlyph to PolyConstructors.java and demonstrate the problem described in
 *      this section.
 *
 *      @see ExercisesSeven
 *      @see PolyConstructors
 *      @see RoundGlyph
 *      @see RectangularGlyph
 */
public class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");
    }
    Glyph() {
        System.out.println("Glyph() before draw()");
        draw();
        System.out.println("Glyph() after draw()");
    }
}
