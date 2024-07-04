package Modelo;

import java.util.LinkedList;
import java.util.List;

public class NodeGraph {
    private Persona user;
    private List<Persona> friends;
    private List<NodeGraph> neighborns;
    public NodeGraph(Persona user){
        this.user = user;
        friends = new LinkedList<>();
        neighborns = new LinkedList<>();
    }

    public Persona getUser() {
        return user;
    }

    public void addFriend(Persona user) {
        this.user = user;
    }

    public List<Persona> getFriends() {
        return friends;
    }

    public void setFriends(List<Persona> friends) {
        this.friends = friends;
    }


    public void addNeighborns(NodeGraph neigoborn) {
        neighborns.add(neigoborn);
    }

    
    
}
