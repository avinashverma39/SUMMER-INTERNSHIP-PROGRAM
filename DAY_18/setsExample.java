package DAY_18;

import java.util.HashSet;
import java.util.Set;
import java.util.*;

//program to implement sets in java
public class setsExample {

    public static void main(String[] args) {
        setsExample s = new setsExample();
        System.out.println("Set 1: " + s.set1);
        System.out.println("Set 2: " + s.set2);
    }

    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();

    setsExample() {
        set1.add(1);
        set1.add(2);
        set2.add(3);
        set2.add(4);
    }

}
