package Application;

import java.util.*;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Set<String> set = new LinkedHashSet<>();
        //LinkedHashSet mantem a ordem que foram colocados
        //TreeSet coloca em ordem alfabética ou numérica
        //HashSet ignora a ordenação e gera numa ordem aleatória

        set.add("Tablet");
        set.add("Notebook");
        set.add("TV");

        //set.remove("Tablet");
        //set.removeIf(x -> x.length() >= 3);
        set.removeIf(x -> x.charAt(0) == 'T');

        //System.out.println(set.contains("Notebook"));
        System.out.println();

        for (String product : set) {
            System.out.println(product);
        }

        scanner.close();
    }
}
