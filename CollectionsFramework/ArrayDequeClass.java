package JavaNotes.CollectionsFramework;

import java.util.ArrayDeque;

public class ArrayDequeClass {
    public static void main(String[] args) {

        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.add(6);
        ad.add(36);
        ad.add(8);

        ad.addFirst(10);
        System.out.println();

        System.out.println(ad.getFirst());
        System.out.println(ad.getLast());
    }
}
