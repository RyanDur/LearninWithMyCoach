package chapter.seven.exercises;

/**
 * Exercise 15:    (2) Add a RectangularGlyph to PolyConstructors.java and demonstrate the problem described in
 *      this section.
 *
 *      @see Glyph
 *      @see PolyConstructors
 *      @see ExercisesSeven
 *      @see RectangularGlyph
 */
public class RoundGlyph extends Glyph {
    private int radius = 1;
    RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
    }
    void draw() {
        System.out.println("RoundGlyph.draw(), radius = " + radius);
    }
}
