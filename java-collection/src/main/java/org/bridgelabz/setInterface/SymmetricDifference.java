package org.bridgelabz.setInterface;

import java.util.Set;
import java.util.HashSet;

public class SymmetricDifference {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        // Compute Symmetric Difference
        Set<Integer> symmetricDiff = new HashSet<>(set1);
        symmetricDiff.addAll(set2);  // Union of both sets

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2); // Common elements

        symmetricDiff.removeAll(intersection); // Remove intersection from union

        System.out.println("Symmetric Difference: " + symmetricDiff);
    }
}
