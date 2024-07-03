package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    private final List<NodeGraph> nodes;

    public Graph() {
        this.nodes = new ArrayList<>();
    }

    public NodeGraph addNode(int value) {
        NodeGraph newNode = new NodeGraph(new Persona());
        nodes.add(newNode);
        return newNode;
    }

    public void addConection(NodeGraph src, NodeGraph dest) {
        src.setFriends(dest.getFriends());
        dest.setFriends(src.getFriends());
    }
    public void printGraph() {
        for (NodeGraph node : nodes) {
            System.out.print("Vertex" + node.getFriends() + ":");
            for (Persona neighbor : node.getFriends()) {
                System.out.print(" -> " + neighbor.getClass());
            }
            System.out.println();
        }
    }
}
