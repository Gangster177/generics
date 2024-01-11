import java.util.ArrayList;
import java.util.List;

public class Generic {
    public static void main(String[] args) {
        //OldWayGeneric//
        List strings = new ArrayList<>();
        strings.add("empty string");
        strings.add("another empty string");
        showStringsOld(strings);
        //............//

        //NewWayGeneric//
        List<String> stringsNew = new ArrayList<>();
        stringsNew.add("empty string");
        stringsNew.add("another empty string");
        showStringsNew(stringsNew);
        //............//
    }

    private static void showStringsOld(List strings) {
        for (int i = 0; i < strings.size(); i++) {
            Object o = strings.get(i);
            String str = (String) o;
            System.out.println(str.toUpperCase());
        }
    }

    private static void showStringsNew(List<String> strings) {
        for (String s : strings
        ) {
            System.out.println(s + " = " + s.length());
        }
    }
}
