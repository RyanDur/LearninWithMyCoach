package chapter.four.excercises;

public class Tank {

    private boolean empty = false;

    public void empty() {
        empty = true;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void releaseTank() throws Throwable {
        this.finalize();
    }

    protected void finalize() throws Throwable {
        if (empty) {
            System.out.println("Tank is empty");
            super.finalize();
        }
    }
}
