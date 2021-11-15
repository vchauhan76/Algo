package Company.BalancedBrackets;


import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * We use Dequeue(LastInFirstOut) Linked list implementation.
 * we add all opening bracket in queue.
 * if it's closing bracket then peek first if it mathces then remove it from queue.
 *
 * At the end if linked list is empty
 *
 */
public class UsingDequeue {




    public static Boolean isBalanced(String str) {

        Deque<Character> deque = new LinkedList<>();


        for (char ch: str.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                deque.addFirst(ch);
            } else {
                if (!deque.isEmpty()
                        && ((deque.peekFirst() == '{' && ch == '}')
                        || (deque.peekFirst() == '[' && ch == ']')
                        || (deque.peekFirst() == '(' && ch == ')'))) {
                    deque.removeFirst();
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String args[]) {

        System.out.println("Output.....   "+UsingDequeue.isBalanced("{([])}"));

    }







}
