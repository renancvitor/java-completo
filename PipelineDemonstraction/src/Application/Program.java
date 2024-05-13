package Application;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> stream1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(stream1.toArray()));

        int sum = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println("Sum = " + sum);

        List<Integer> newList = list.stream()
                        .filter(x -> x % 2 == 0)
                                .map(x -> x * 10)
                                        .collect(Collectors.toList());
        System.out.println(Arrays.toString(newList.toArray()));

        List<Integer> newList2 = list.stream()
                .filter(x -> x % 2 != 0)
                .map(x -> x * 10)
                .collect(Collectors.toList());
        System.out.println(Arrays.toString(newList2.toArray()));

        scanner.close();
    }
}
