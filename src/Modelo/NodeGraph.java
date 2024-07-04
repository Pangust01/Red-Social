package Modelo;

import java.util.LinkedList;
import java.util.List;

public class NodeGraph {
    private Persona user;
    private List<Persona> friends;
    public NodeGraph(Persona user){
        this.user = user;
        friends = new LinkedList<>();
    }

    public Persona getUser() {
        return user;
    }

    public void addFriend(Persona user) {
        friends.add(user);
    }

    public List<Persona> getFriends() {
        return friends;
    }

    public void setFriends(List<Persona> friends) {
        this.friends = friends;
    }


    
    
}
