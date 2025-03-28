package org.bridgelabz.setInterface;

import java.util.HashSet;

public class SubsetCheck {
    public static void main(String args[]){

        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        set.add(3);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);


        boolean isSubset = set2.containsAll(set);

        System.out.println(isSubset);
    }
}
