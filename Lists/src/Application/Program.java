package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        list.add("Marry");
        list.add("Ingrid");
        list.add("Jeff");
        list.add("Sarah");
        list.add(2, "Mayara");

        System.out.println(list.size());

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("______________________");

        list.remove(1);
        list.remove("Jeff");
        list.removeIf(x -> x.charAt(0) == 'M');

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("______________________");

        System.out.println("Index of Sarah:  " + list.indexOf("Sarah"));
        System.out.println("Index of Jeff:  " + list.indexOf("Jeff"));

        System.out.println("______________________");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'S').collect(Collectors.toList());

        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("______________________");

        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);


        sc.close();
    }
}
