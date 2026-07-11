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
        System.out.println("Set 6: " + s.set6);
        System.out.println("Set 7: " + s.set7);
    }

    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();
    LinkedHashSet<Integer> set4 = new LinkedHashSet<>();
    LinkedHashSet<String> set6 = new LinkedHashSet<>();
    Set<String> set3 = new HashSet<>();
    TreeSet<Integer> set5 = new TreeSet<>();
    TreeSet<String> set7 = new TreeSet<>();

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

        set6.add("Java");
        set6.add("Python");
        set6.add("C++");
        set6.add("JavaScript");
        set6.add("java");

        for (int i = 0; i < 10; i++) {
            set3.add("Number " + i);
        }
        
        for (int i = 0; i < 10; i++) {
            set3.add("Number " + i);
        }

        set7.add("Java");
        set7.add("Python");
        set7.add("C++");
        set7.add("JavaScript");
        set7.add("java");
    }

}
