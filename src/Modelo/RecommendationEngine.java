package Modelo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.validation.Validator;

public class RecommendationEngine {
    public List<Persona> recommendFriends(NodeGraph node, Graph graph){
        List<Persona> recommendations = new ArrayList<>();
        for (NodeGraph nodeGraph : graph.getNodes()) {
            if (!node.getFriends().contains(nodeGraph.getUser())&& !node.getUser().equals(nodeGraph.getUser())) {
                double similarity = calculateSimilarity(node.getUser(), nodeGraph.getUser());
                if (similarity>0.3) {//Umbral para recomendacion
                    recommendations.add(nodeGraph.getUser());
                }
            }
        }
        return recommendations;
    }
    public double calculateSimilarity(Persona user1, Persona user2){
        Set<String> interes1 = new HashSet<>(user1.getInterest());
        Set<String> interes2 = new HashSet<>(user2.getInterest());
        Set<String> interseccion = new HashSet<>(interes1);
        interseccion.retainAll(interes2);
        Set<String> union = new HashSet<>(interes1);
        union.addAll(interes2);
        double resp = (double) interseccion.size()/union.size();
        System.out.println("\nValor - "+resp);
        return resp;
    }
}
