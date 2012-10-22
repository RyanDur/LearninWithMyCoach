package chapter.four.excercises;

public class StaticTest {

    static String str = "string";
    static String str2;

    static {str2 = "47";}

    public static void print() {
        System.out.println(str);
        System.out.println(str2);
    }

}
