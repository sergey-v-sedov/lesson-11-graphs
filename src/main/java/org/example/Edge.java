package org.example;

public class Edge {
    Node node;
    int weight;

    public Edge(Node node, int weight) {
        this.node = node;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "node=" + node.value +
                ", weight=" + weight +
                '}';
    }
}
