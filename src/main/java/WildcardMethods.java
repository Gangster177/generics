import java.util.ArrayList;
import java.util.List;

public class WildcardMethods {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(12);
        integers.add(123);
        System.out.println("#getSumElements(integers):");
        System.out.println(getSumElements(integers));

        List<Double>doubles = new ArrayList<>();
        doubles.add(1.0);
        doubles.add(12.0);
        doubles.add(123.0);
        System.out.println("#getSumElements(doubles):");
        System.out.println(getSumElements(doubles));

        List<Number>numbers = new ArrayList<>();
        addNewElements(numbers);
        System.out.println("#getSumElements(numbers):");
        System.out.println(getSumElements(numbers));
    }

/*
PECS - Producer Extends Consumer Super
List<? extends Number> numbers, где
 numbers - Producer, значит предоставляет элементы и добавлять ничего нельзя
List<? super Number> numbers, где
 numbers - Consumer(потребитель), значит может добавлять в себя элементы типа Number
 */
    public static int getSumElements(List<? extends Number> numbers) {//ограничение на верхнюю границу
        int sum = 0;
        for (Number n : numbers) {
            sum +=n.intValue();
        }
        return sum;
    }

    public static void addNewElements(List<? super Number> numbers) {//ограничение на нижнюю границу
        numbers.add(11);
        numbers.add(11f);
        numbers.add(113);
        numbers.add(11d);

    }

}
