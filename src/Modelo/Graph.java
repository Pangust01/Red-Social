package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    private final List<NodeGraph> nodes;

    public Graph() {
        this.nodes = new ArrayList<>();
    }

    public NodeGraph addNode(NodeGraph node) { 
        nodes.add(node);
        return node;
    }

    public void addConection(NodeGraph src, NodeGraph dest) {
        src.addFriend(dest.getUser());
        dest.addFriend(src.getUser());
    }

    public List<Persona> getFriends(NodeGraph node){
        for (int i = 0; i < node.getFriends().size(); i++) {
            
            System.out.print("Amigos" + node.getFriends() + ":");
            for (Persona amigos : node.getFriends()) {
                System.out.print(" -> " + amigos.getName()+" -> " + amigos.getAge());
            }
            
        }
        throw new ExceptionInInitializerError("No se inicializa una lista");
    }

    public List<Persona> recommendedFriends(NodeGraph node){
        throw new ExceptionInInitializerError("No se inicializa una lista");
    }
    public void printGraph() {
        for (NodeGraph node : nodes) {
            System.out.print("Amigos" + node.getFriends() + ":");
            for (Persona neighbor : node.getFriends()) {
                System.out.print(" -> " + neighbor.getName()+" -> " + neighbor.getAge());
            }
            System.out.println();
        }
    }
}
