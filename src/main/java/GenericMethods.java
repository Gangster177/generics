import entity.Developer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class GenericMethods {
    public static <T> T coalesce(T... elements) {
        for (T e : elements) {
            if (e != null) {
                return e;
            }
        }
        return null;
    }

    public static <T, U> List<U> convertList(List<T> originList, Function<T, U> mapFunction) {
        List<U> newList = new ArrayList<>();
        for (T element : originList) {
            newList.add(mapFunction.apply(element));
        }
        return newList;
    }

    public static void main(String[] args) {
        //TODO example: coalesce(T... elements)
        Developer developerOne = new Developer("Dima", 100000, "project");
        Developer developerTwo = null;
        System.out.println(coalesce(developerOne, developerTwo));

        //TODO example: Function<T, U>
        Function<Integer, String > mapper = integer -> String.valueOf(integer + "-string");
//        Function<Integer, String > mapper = new Function<Integer, String>() {
//            @Override
//            public String apply(Integer integer) {
//                return String.valueOf(integer + "-string");
//            }
//        };
        List<Integer> integers = new ArrayList<>();
        integers.add(123);
        integers.add(12);
        integers.add(1);

        List<String> strings = convertList(integers, mapper);
        for( String s: strings){
            System.out.println(s);
        }

    }
}
