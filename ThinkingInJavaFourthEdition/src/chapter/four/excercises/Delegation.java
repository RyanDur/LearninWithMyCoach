package chapter.four.excercises;

public class Delegation {

    public void method1() {
        method2();
        this.method2();
    }

    private void method2() {
        System.out.println("I have been called");
    }

}
