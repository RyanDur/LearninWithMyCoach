package chapter.two.exercises;

/**
 * Exercise 5:  (2) Create a class called Dog containing two Strings: name and says. In main( ), create two dog
 *      objects with names spot (who says, Ruff!) and scruffy (who says, Wurf!). Then display their
 *      names and what they say.
 *
 * Exercise 6:  (3) Following Exercise 5, create a new Dog reference and assign it to spots object. Test for
 *      comparison\ using == and equals( ) for all references.
 *
 *      @see ExercisesTwo
 */
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

    public void bark() {
        System.out.println(this.says);
    }

    public void bark(String bark) {
        System.out.println(bark);
    }

    public void fetch(int thrown, String obj) {
        System.out.println("retrieve " + obj + " " + thrown + " times");
    }

    public void fetch(String obj, int thrown) {
        fetch(thrown, obj);
    }
}
