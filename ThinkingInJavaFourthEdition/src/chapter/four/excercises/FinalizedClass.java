package chapter.four.excercises;

public class FinalizedClass {

    public FinalizedClass() throws Throwable {
        this.finalize();
    }

    protected void finalize() throws Throwable {
        System.out.println("Finalized");
        super.finalize();
    }

}
