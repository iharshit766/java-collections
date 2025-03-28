package org.bridgelabz.setInterface;

import java.util.Set;
import java.util.HashSet;

public class SetOperations {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        // Union
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        System.out.println("Union: " + unionSet);

        // Intersection
        Set<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        System.out.println("Intersection: " + intersectionSet);
    }
}
