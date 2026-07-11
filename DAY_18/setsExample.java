package DAY_18;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.*;

//program to implement sets in java
public class setsExample {

    public static void main(String[] args) {

        setsExample s = new setsExample();
        System.out.println("Set 1: " + s.set1);
        System.out.println("Set 2: " + s.set2);
        System.out.println("Set 3: " + s.set3);
        System.out.println("Set 4: " + s.set4);
        System.out.println("Set 5: " + s.set5);
    }

    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();
    LinkedHashSet<Integer> set4 = new LinkedHashSet<>();
    Set<String> set3 = new HashSet<>();
    TreeSet<Integer> set5 = new TreeSet<>();

    setsExample() {
        set1.add(1);
        set1.add(2);
        set2.add(3);
        set2.add(4);
    
        set4.add(13);
        set4.add(43);
        set4.add(33);
        set4.add(44);


        set5.add(45);
        set5.add(24);
        set5.add(33);
        set5.add(44);


        set3.add("Java");
        set3.add("Python");
        set3.add("C++");
        set3.add("JavaScript");
        set3.add("java");
    }

}
