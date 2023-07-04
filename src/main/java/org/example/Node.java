package org.example;

import java.util.LinkedList;

public class Node {
    String value;
    LinkedList<Edge> nodes = new LinkedList<>();

    public void print() {
        System.out.println(value);
        nodes.forEach((node) -> {
            System.out.println(node);
        });
    }
}
