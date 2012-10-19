package chapter.two.exercises;

public class Dog {
    String name;
    String says;

    public Dog(String name, String says) {
        this.name = name;
        this.says = says;
    }

    public void speak() {
        System.out.println(name + " says " + says);
    }
}
