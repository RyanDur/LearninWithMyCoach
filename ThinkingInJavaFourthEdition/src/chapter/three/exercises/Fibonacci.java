package chapter.three.exercises;

public class Fibonacci {
    int i;
    int k;
    int j;

    public Fibonacci() {
        i = 0;
        k = 1;
    }

    public void printFib(int num) {
        for (int l = 0; l < num; l++) {
            System.out.println(j = i + k);
            i = k;
            k = j;
        }
    }
}
