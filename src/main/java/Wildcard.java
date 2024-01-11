import java.util.ArrayList;
import java.util.List;

public class Wildcard {
    public static void main(String[] args) {
        List<? extends Number> numbers= new ArrayList<Integer>();
        Number[] numbers1 = new Integer[10];
    }
}
