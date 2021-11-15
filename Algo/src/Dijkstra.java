import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class Dijkstra {








    public static void  main(String args[]) {

        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");

        //Adding neighbours
        nodeA.addDestination(nodeB, 10);
        nodeA.addDestination(nodeC, 15);

        nodeB.addDestination(nodeD, 12);
        nodeB.addDestination(nodeF, 15);

        nodeC.addDestination(nodeE, 10);

        nodeD.addDestination(nodeE, 2);
        nodeD.addDestination(nodeF, 1);

        nodeF.addDestination(nodeE, 5);

        Graph graph = new Graph();
        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeE);
        graph.addNode(nodeF);

        Graph graph1 = Dijkstra.calculateShortestPathSource(graph,nodeA);

       for(Node node : graph1.getGraphNodes())
       {
           System.out.println("Name : "+ node.getName());
           System.out.println("Distance: "+ node.getDistance().toString());
             for(Node node1: node.getShortestPath()){
                 System.out.println(node1.getName());

             }

       }


    }

    private  static Graph calculateShortestPathSource(Graph graph, Node sourceNode) {

        sourceNode.setDistance(0);

        Set<Node> settledNodes = new HashSet<>();
        Set<Node> unsettledNodes = new HashSet<>();
        unsettledNodes.add(sourceNode);

        while (unsettledNodes.size()!=0) {
         Node currentNode = getLowestDistanceNode(unsettledNodes);
             //chosing the samllest node.
            //Now update adjacent nodes of current ndde.
            for(Map.Entry<Node,Integer> entry : currentNode.getAdJoiningNodes().entrySet())
            {
                 Node adjacentNode =  entry.getKey();
                 Integer weight =  entry.getValue();

                LinkedList<Node> shortestPath = new LinkedList<>(currentNode.getShortestPath());
                shortestPath.add(currentNode);
                adjacentNode.setShortestPath(shortestPath);

                 if(adjacentNode.getDistance() > currentNode.getDistance() + weight) {
                                 adjacentNode.setDistance(currentNode.getDistance() + weight);
                 }
                 unsettledNodes.add(adjacentNode);
            }
                settledNodes.add(currentNode);
                unsettledNodes.remove(currentNode);

        }

     return graph;

    }


    private static Node getLowestDistanceNode(Set<Node> unsettledNodes) {
        Node lowestDistanceNode=null;
        int lowestDistance = Integer.MAX_VALUE;
        for(Node node : unsettledNodes) {
                int nodeDistance = node.getDistance();
            if(nodeDistance < lowestDistance) {
                lowestDistance = nodeDistance;
                lowestDistanceNode = node;
            }
        }
        return lowestDistanceNode;
    }
}