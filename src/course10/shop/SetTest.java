package course10.shop;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

    public static void main(String[] args) {

        System.out.println("HashSet------------");
        Set<Integer> nrs = new HashSet<>(); // no order
        nrs.add(1);
        nrs.add(1);
        nrs.add(10);
        nrs.add(10);
        nrs.add(1);
        nrs.add(22);
        nrs.add(49);
        //nrs.forEach(System.out::println);
        nrs.forEach(nr -> System.out.println(nr));

        System.out.println("TreeSet------------");

        Set<Integer> orderedNrs = new TreeSet<>(); // ordered by default by their values
        orderedNrs.add(49);
        orderedNrs.add(22);
        orderedNrs.add(10);
        orderedNrs.add(1);
        orderedNrs.forEach(nr -> System.out.println(nr));

        System.out.println("TreeSet------------");

        Set<String> names = new TreeSet<>();
        names.add("Radu");
        names.add("Oana");
        names.add("Ana");
        names.add("Carmen");
        System.out.println("names size: " + names.size());
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("Remove \"Radu\"");
        names.remove("Radu");
        System.out.println("names size (after removal): " + names.size());
        for (String name : names) {
            System.out.println(name);
        }

    }
}
