package Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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

    public Set<Persona> getFriends(NodeGraph node){
        return node.getFriends();
    }
    public List<NodeGraph> getNodes(){
        return nodes;
    }
    public List<Persona> recommendedFriends(NodeGraph node){
        throw new ExceptionInInitializerError("No se inicializa una lista");
    }
    public void printGraph() {
        for (NodeGraph nodeBuscar : nodes) {
            System.out.print("\nLos amigos de " + nodeBuscar.getUser().toString()+":\n");
            for (Persona user : nodeBuscar.getFriends()) {
                System.out.print(" -> " + user.getName()+" con " + user.getAge()+" años");
            }
        }
        System.out.println("\n\nHobbies de los usuarios: \n");
        for (NodeGraph nodeGraph : nodes) {

            System.out.println(nodeGraph.getUser().getName()+" - "+nodeGraph.getUser().getInterest().toString());
            
        }

    }


}
