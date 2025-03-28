package org.bridgelabz.listInterface;

import java.util.*;

public class ListRotator {
    // Method to rotate elements in a list
    public static void rotateList(List<Integer> list, int positions) {
        int size = list.size();
        positions = positions % size; // Handle rotations greater than list size
        List<Integer> rotated = new ArrayList<>(list.subList(positions, size));
        rotated.addAll(list.subList(0, positions));
        list.clear();
        list.addAll(rotated);
    }

    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int rotateBy = 2;
        System.out.println("Original List: " + inputList);
        rotateList(inputList, rotateBy);
        System.out.println("Rotated List: " + inputList);
    }
}