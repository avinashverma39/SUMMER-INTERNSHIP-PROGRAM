package DAY_18;

import java.util.HashMap;
import java.util.*;

public class mapsExample {

    public static void main(String[] args) {

        HashMap<Integer, String> map1 = new HashMap<>();
        LinkedHashMap<Integer, String> map2 = new LinkedHashMap<>();
        TreeMap<Integer, String> map3 = new TreeMap<>();
        map1.put(101, " One");
        map1.put(102, " Two");
        map1.put(103, " Three");
        map1.put(104, " Four");

        map2.put(101, " One");
        map2.put(102, " Two");
        map2.put(103, " Three");
        map2.put(104, " Four");

        map3.put(101, " One");
        map3.put(102, " Two");
        map3.put(103, " Three");
        map3.put(104, " Four");

        map1.put(102, " Two");
        map1.put(103, " Three");
        map1.put(104, " Four");

        System.out.println("Map 1: " + map1);
        System.out.println("Map 2: " + map2);
        System.out.println("Map 3: " + map3);
    }
}
