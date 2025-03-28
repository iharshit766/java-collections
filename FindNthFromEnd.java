import java.util.*;

public class FindNthFromEnd {
    // Method to find the Nth element from the end in a LinkedList
    public static String findNthFromEnd(LinkedList<String> list, int n) {
        Iterator<String> first = list.iterator();
        Iterator<String> second = list.iterator();

        // Move first iterator n steps ahead
        for (int i = 0; i < n; i++) {
            if (!first.hasNext()) {
                throw new IllegalArgumentException("N is larger than the list size");
            }
            first.next();
        }

        // Move both iterators until first reaches the end
        while (first.hasNext()) {
            first.next();
            second.next();
        }

        return second.next();
    }

    public static void main(String[] args) {
        // Example linked list
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        System.out.println("Original List: " + list);
        int n = 2;
        System.out.println(n + "th element from the end: " + findNthFromEnd(list, n));
    }
}