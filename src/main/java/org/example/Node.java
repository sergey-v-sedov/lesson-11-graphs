package org.example;

import java.util.LinkedList;

public class Node {
    String value;
    LinkedList<Node> nodes = new LinkedList<>();

    public void print() {
        StringBuffer out = new StringBuffer();
        out.append(value);
        nodes.forEach(node -> {
            out.append("->");
            out.append(node.value);
        });
        System.out.println(out.toString());
    }
}
