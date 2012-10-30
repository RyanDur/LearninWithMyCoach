package chapter.seven.exercises;

public class Instrument {
    void play(Note n) {
        System.out.println("Instrument.play() " + n);
    }
    String what() { return "Instrument"; }
    void adjust() {
        System.out.println("Adjusting Instrument");
    }
}
