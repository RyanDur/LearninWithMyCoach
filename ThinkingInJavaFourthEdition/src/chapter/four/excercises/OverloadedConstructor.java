package chapter.four.excercises;

public class OverloadedConstructor {

    public OverloadedConstructor() {
        this(1, "2");
    }

    public OverloadedConstructor(int num, String str){
        System.out.println(num+str);
    }

}
