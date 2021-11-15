import java.util.HashSet;
import java.util.Set;

public class Graph {

    private Set<Node> graphNodes = new HashSet<>();

    public void addNode(Node node) {
        graphNodes.add(node);
    }

    public Set<Node> getGraphNodes() {
        return graphNodes;
    }

    public void setGraphNodes(Set<Node> graphNodes) {
        this.graphNodes = graphNodes;
    }

}
