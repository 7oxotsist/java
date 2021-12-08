import java.util.Arrays;

public class Shirt{
    String [] arr; String out;
    public Shirt(String[] s) {
        arr = s;
        output();
    }

    public void output() {
        out = "";
        for (String s : arr) {
            out = out + s + "\n";
        }
    }

    @Override
    public String toString() {
        return out;
    }
}