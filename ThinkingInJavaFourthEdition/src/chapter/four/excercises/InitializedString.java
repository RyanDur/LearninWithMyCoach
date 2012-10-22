package chapter.four.excercises;

public class InitializedString {
    String string = "default";

    public InitializedString() {
        System.out.println(this.string);
    }

    public InitializedString(String string) {
        this.string = string;
        System.out.println(this.string);
    }
}
