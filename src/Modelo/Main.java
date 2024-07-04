package Modelo;
public class Main {
    public static void main(String[] args) throws Exception {
        Graph redSocial = new Graph();
        NodeGraph persona1 = new NodeGraph(new Persona("Daniel", 18));
        NodeGraph persona2= new NodeGraph(new Persona("Daniel", 18));
        NodeGraph persona3 = new NodeGraph(new Persona("Daniel", 18));
        redSocial.addNode(persona1);
        redSocial.addNode(persona2);
        redSocial.addNode(persona3);
        redSocial.addConection(persona2, persona3);
        redSocial.addConection(persona1, persona3);
        redSocial.printGraph();

    }
}
