package chapter.two.exercises;

import java.util.Random;

public class Coin {
    Random rn;

    public Coin(){
        rn = new Random();
    }

    public String flip() {
        return (rn.nextInt() + 1) % 2 == 0 ? "tails" : "heads";
    }
}
