package chapter.seven.exercises;

import java.util.Random;

public class RandomInstrumentGenerator {
    private Random rand = new Random(47);
    public Instrument next() {
        switch(rand.nextInt(6)) {
            default:
            case 0: return new Wind();
            case 1: return new Percussion();
            case 2: return new Stringed();
            case 3: return new Brass();
            case 4: return new Woodwind();
            case 5: return new Reed();
        }
    }
}
