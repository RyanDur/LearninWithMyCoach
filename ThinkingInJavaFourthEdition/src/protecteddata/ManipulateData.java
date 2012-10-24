package protecteddata;

/**
 * Exercise 6:  (1) Create a second class in the same file with a method that manipulates the protected data in the
 *      first class.
 *      @see chapter.five.excercises.ExcercisesFive
 *      @see ProtectedData
 */
public class ManipulateData extends ProtectedData{


    public void setString(String string) {
        this.string = string;
    }

    public String getSring() {
        return string;
    }

    public void setInt(int i) {
        this.i = i;
    }
    public int getInt() {
        return i;
    }

    public int getK() {
        return k;
    }
}
