package chapter.seven.exercises;

public class Music3 {
    public static void tuneAll(Instrument[] e) {
        for(Instrument i : e)
            tune(i);
    }

    public static void tune(Instrument i) {
        // ...
        i.play(Note.MIDDLE_C);
    }
}
