package JavaNotes.CollectionsFramework;


import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
//ArrayList
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        //Add Method
        l1.add(6);
        l1.add(4);
        l1.add(7);
        l1.add(5);
        l1.add(0,3);
        l1.add(1,13);
        l1.addFirst(944);
        l1.addLast(393);
        l2.add(62);
        l2.add(41);
        l2.add(72);
        l2.add(58);

        //remove method
        l1.remove(1);

        //set method
        l1.set(1,455);

        //addAll Method
        l1.addAll(l2);
        l1.addAll(0,l2);

        //clear method
        //l1.clear();

        //isEmpty
        boolean isEmpty = l1.isEmpty();
        System.out.println(isEmpty);

        //contains method
        //System.out.println(l1.contains(0));
        //System.out.println(l1.contains(58));

        //indexOf and lastIndexOf method
        //System.out.println(l1.indexOf(58));
        //System.out.println(l1.indexOf(100));
        //System.out.println(l1.lastIndexOf(58));

/*      for (int element : l1){
            System.out.println(element);
        }
*/
        for (int i=0 ; i<l1.size() ; i++){
            System.out.println(l1.get(i));
        }

    }
}
