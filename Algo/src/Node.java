import java.util.*;

public class Node {
    public void setName(String name) {
        this.name = name;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public void setAdJoiningNodes(Map<Node, Integer> adJoiningNodes) {
        this.adJoiningNodes = adJoiningNodes;
    }

    public void setShortestPath(List<Node> shortestPath) {
        this.shortestPath = shortestPath;
    }

    private String name;

    private Integer distance = Integer.MAX_VALUE;

    private Map<Node, Integer> adJoiningNodes = new HashMap<>();

    private List<Node> shortestPath = new LinkedList<>();

    public void addDestination(Node destination, int weight) {
        adJoiningNodes.put(destination, weight);
    }

    public Node(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public Integer getDistance() {
        return distance;
    }

    public Map<Node, Integer> getAdJoiningNodes() {
        return adJoiningNodes;
    }

    public List<Node> getShortestPath() {
        return shortestPath;
    }

}