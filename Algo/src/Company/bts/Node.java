package Company.bts;

import java.util.*;

public class Node<T> {

    private T value ;

    public Set<Node<T>> getNeighbours() {
        return neighbours;
    }

    private Set<Node<T>> neighbours;


 public Node(T value) {

       this.value = value;
       this.neighbours = new HashSet<>();
 }


 public T getValue() {
     return  this.value;
 }




 public void connect(Node<T> node) {
     if (this == node) throw new IllegalArgumentException("Can't connect node to itself");
     this.neighbours.add(node);
     node.neighbours.add(this);
 }

 public static <T> Optional<Node<T>> search(T value, Node<T> start) {

     Set<Node<T>> visitedSet = new HashSet<>();
     Queue<Node<T>> processingQueue = new ArrayDeque<>();
     processingQueue.add(start);

     Node<T> currentNode;

     while (!processingQueue.isEmpty()) {
         currentNode = processingQueue.remove();

         if (currentNode.getValue().equals(value)) {

             return Optional.of(currentNode);
         } else
         {
             visitedSet.add(currentNode);
             processingQueue.addAll(currentNode.getNeighbours());
             processingQueue.removeAll(visitedSet);
         }

     }
     return Optional.empty();

 }



}
