package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {



        List<List<Integer>> dynamicMatrix = new ArrayList<>();
        dynamicMatrix.add(Arrays.asList(0, 1, 1, 0));
        dynamicMatrix.add(Arrays.asList(1, 0, 1, 1));
        dynamicMatrix.add(Arrays.asList(1, 1, 0, 1));
        dynamicMatrix.add(Arrays.asList(0, 1, 1, 0));

        Node node1 = new Node();
        node1.value = "Узел 1";

        Node node2 = new Node();
        node2.value = "Узел 2";

        Node node3 = new Node();
        node3.value = "Узел 3";

        Node node4 = new Node();
        node4.value = "Узел 4";

        node1.nodes.add(new Edge(node2, 5));
        node1.nodes.add(new Edge(node3, 3));

        node2.nodes.add(new Edge(node1, 4));
        node2.nodes.add(new Edge(node3, 1));
        node2.nodes.add(new Edge(node4, 1));

        node3.nodes.add(new Edge(node1, 2));
        node3.nodes.add(new Edge(node2, 0));
        node3.nodes.add(new Edge(node4, 7777));

        node4.nodes.add(new Edge(node2, 7));
        node4.nodes.add(new Edge(node3, 33));

        node1.print();
        node2.print();
        node3.print();
        node4.print();

        hasPath(1, 3);
    }

    static int[][] matrix = new int[][]{
            {0, 1, 1, 0},
            {1, 0, 1, 1},
            {1, 1, 0, 1},
            {0, 1, 1, 0}
    };

    static void hasPath(int source, int target) {
        boolean[] visited = new boolean[matrix.length]; // массив посещенных вершин

        LinkedList<Integer> queue = new LinkedList<>();

        visited[source] = true;
        queue.add(source);

        while (!queue.isEmpty()) {
            int current = queue.poll();

            if (current == target) {
                // путь от исходной вершины source до целевой target найден
                System.out.println("Путь найден");
                return;
            }

            for (int n = 0; n < matrix[current].length; n++) {
                /*
                Обход по всем смежным вершинам текущей вершины:
                Если смежная вершина еще не была посещена, она отмечается как посещенная
                и добавляется в очередь на обработку её смежных вершин.
                 */
                if (matrix[current][n] == 1 && !visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }

        System.out.println("Путь не найден");
    }
}