package Modelo;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Graph redSocial = new Graph();
         // Crear usuarios
        Persona persona1 = new Persona("Alice", 30);
        Persona persona2 = new Persona("Bob", 25);
        Persona persona3 = new Persona("Charlie", 35);
        Persona persona4 = new Persona("Dave", 40);
        Persona persona5 = new Persona("Eve", 28);
        persona1.setInterest(Arrays.asList("Music", "Art"));
        persona2.setInterest(Arrays.asList("Music", "Sports"));
        persona3.setInterest(Arrays.asList("Art", "Movies"));
        persona4.setInterest(Arrays.asList("Sports", "Travel"));
        persona5.setInterest(Arrays.asList("Music", "Movies"));
        // Crear nodos
        NodeGraph node1 = new NodeGraph(persona1);
        NodeGraph node2 = new NodeGraph(persona2);
        NodeGraph node3 = new NodeGraph(persona3);
        NodeGraph node4 = new NodeGraph(persona4);
        NodeGraph node5 = new NodeGraph(persona5);

        redSocial.addNode(node1);
        redSocial.addNode(node1);
        redSocial.addNode(node2);
        redSocial.addNode(node3);
        redSocial.addNode(node4);
        redSocial.addNode(node5);

         // Añadir conexiones
        redSocial.addConection(node1, node2);
        redSocial.addConection(node1, node3);
        redSocial.addConection(node2, node4);
        redSocial.addConection(node2, node3);
        redSocial.addConection(node3, node5);
        redSocial.printGraph();
        
        // Recomendaciones de amigos
        RecommendationEngine engine = new RecommendationEngine();
        List<Persona> recomendations = engine.recommendFriends(node1, redSocial);
        System.out.println("Amigos recomendados para "+persona1.getName()+": "+ recomendations);
   
    
    }
}
