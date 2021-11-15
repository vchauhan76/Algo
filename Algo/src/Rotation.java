import java.util.*;

public class Rotation {

  //[1,2,3,4,5]   = [2,3,4,5,1]----1st iteration.


    /**
     * 1) Pop first element from original array and add first in new array.
     * 2) Then start from last element from original array and statt adding in first in new array
     *
     * 3) repeat this process for input
     */


    // [2,3,4,5,1]

    //[3,4,5,1,2]---2nd iteration.

    public static void main(String args[]) {

        Deque<Integer> originalQueue = new ArrayDeque<>();
        originalQueue.add(1);
        originalQueue.add(2);
        originalQueue.add(3);
        originalQueue.add(4);
        originalQueue.add(5);

        Deque<Integer> newQueue = new ArrayDeque<>();

       for(int i= 0 ; i<4 ; i++) {
          newQueue.addLast(originalQueue.pollFirst());
               for(int j=0; j<originalQueue.size() ; j++) {
                   newQueue.addFirst(originalQueue.pollLast());
               }
       }
       System.out.println(newQueue);

    }


}
