package chapter.six.exercises;

/**
 * Exercise 14:    (1) In Car.java add a service( ) method to Engine and call this method in main( ).
 *
 *      @see ExercisesSix
 *      @see Door
 *      @see Window
 *      @see Wheel
 *      @see Engine
 */
public class Car {
    public Engine engine = new Engine();
    public Wheel[] wheel = new Wheel[4];
    public Door
            left = new Door(),
            right = new Door(); // 2-door
    public Car() {
        for(int i = 0; i < 4; i++)
            wheel[i] = new Wheel();
    }
}
