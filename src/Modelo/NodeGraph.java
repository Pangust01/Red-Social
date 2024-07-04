package Modelo;

import java.util.HashSet;

import java.util.Set;

public class NodeGraph {
    private Persona user;
    private Set<Persona> friends;
    public NodeGraph(Persona user){
        this.user = user;
        friends = new HashSet<>();
    }

    public Persona getUser() {
        return user;
    }

    public void addFriend(Persona user) {
        friends.add(user);
    }

    public Set<Persona> getFriends() {
        return friends;
    }

    public void setFriends(Set<Persona> friends) {
        this.friends = friends;
    }


    
    
}
