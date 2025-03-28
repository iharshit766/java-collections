package org.bridgelabz.setInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class SetSortedList {
public static void main(String[] args) {
    HashSet<Integer> set = new HashSet<>();
    set.add(1);
    set.add(2);
    set.add(5);
    set.add(4);
    set.add(3);

    ArrayList<Integer> list = new ArrayList<>(set);

    Collections.sort(list);

    System.out.println("Sorted List: " + list);
}


}
