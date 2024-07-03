package Modelo;

import java.util.List;

public class NodeGraph {
    private Persona user;
    private List<Persona> friends;

    public NodeGraph(Persona user){
        this.user = user;
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

    
}
