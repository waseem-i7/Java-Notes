package JavaNotes.CollectionsFramework;

import java.util.ArrayDeque;

public class ArrayDequeClass {
    public static void main(String[] args) {

        //array deque is used to add and remove elements from both side(start and end).
        //ArrayDeque() constructs an empty array deque with an initial capacity sufficient to hold 16 elements.
        //ArrayDeque(int numElements) constructs an empty array deque with an initial capacity sufficient to hold
        //the specified number of elements.
        /*
          Summary of Deque methods
                     First Element(Head)                   Last Element(Tail)

               Throws exception      special value     Throws exception     special value
      Insert     addFirst(e)          offerFirst(e)      addLast(e)           offerLast(e)
      Remove     removeFirst()        pollFirst()        removeLast()         pollLast()
      Examine    getFirst()           peekFirst()        getLast()            peekLast()


         Comparison of Queue and Deque methods
         Queue Method          Equivalent Deque Method
          add(e)                 addLast(e)
          offer(e)               offerLast(e)
          remove()               removeFirst()
          poll()                 pollFirst()
          element()              getFirst()
          peek()                 PeekFirst()

         */
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.add(6);
        ad.add(36);
        ad.add(8);
        ad.add(12);
        ad.add(70);
//        ad.addLast(90);
//
//
//        ad.addFirst(10);


        System.out.println(ad.removeFirst());
        System.out.println( ad.remove());
        System.out.println( ad.removeLast());
        System.out.println(ad.getLast());
    }
}
