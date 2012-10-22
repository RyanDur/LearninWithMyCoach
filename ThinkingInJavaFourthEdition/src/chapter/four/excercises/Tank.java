package chapter.four.excercises;

public class Tank {

    private boolean empty = false;

    public void isEmpty() {
        empty = true;
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
