package code05;

import Graph.Graph;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GraphTest {
    @Test
    void GraphTestAdd(){
        Graph graph = new Graph();
        graph.addNode("Khair");
        graph.addNode("Eldeen");
        graph.addNode("Shkokany");
        assertEquals(graph.getNodes(), graph.getNodes());
    }

    @Test void GraphTestAddEdge(){

        Graph graph = new Graph();
        graph.addNode("Khair");
        graph.addNode("Eldeen");
        graph.addNode("Shkokany");

        graph.addEdge("Shkokany", "Khair");
        graph.addEdge("Shkokany", "Eldeen");
        graph.addEdge("Shkokany", "Shkokany");
        graph.addEdge("Khair", "Eldeen");
        assertEquals("[Vertex{label='Shkokany', weight=0}, Vertex{label='Khair', weight=0}, Vertex{label='Eldeen', weight=0}]",graph.getNodes().toString());
    }

    @Test
    public void emptyGraph(){

        Graph graph = new Graph();
        assertEquals(0,graph.size());

    }
}
