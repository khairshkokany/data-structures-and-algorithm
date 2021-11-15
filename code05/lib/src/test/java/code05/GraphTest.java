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
    @Test
    public void breadthFirstSearch () {
        Graph graph = new Graph();
        graph.addNode("Name");
        graph.addNode("Khair");
        graph.addNode("Eldeen");
        graph.addNode("Shkokany");
        graph.addNode(":')");
        graph.addNode("Hate");
        graph.addNode("Everything");


        graph.addEdge("Name", "Khair");
        graph.addEdge("Name", "Eldeen");
        graph.addEdge("Name", "Shkokany");
        graph.addEdge("Khair", "Hate");
        graph.addEdge("Hate", "Everything");
        graph.addEdge("Hate", ":')");

        assertEquals("[Name, Khair, Eldeen, Shkokany, Hate, Everything, :')]" ,graph.breadthFirstSearch("Name").toString());
    }
    @Test
    public void bustTest() {
        Graph graphs = new Graph();
        graphs.addNode("Name");
        graphs.addNode("Khair");
        graphs.addNode("Eldeen");
        graphs.addNode("Shkokany");
        graphs.addNode(":')");
        graphs.addNode("Hate");
        graphs.addNode("Everything");

        graphs.addEdges("Name", "Khair",45);
        graphs.addEdges("Name", "Eldeen",20);
        graphs.addEdges("Name", "Shkokany",60);
        graphs.addEdges("Khair", "Hate",70);
        graphs.addEdges("Hate", "Everything",90);
        graphs.addEdges("Hate", ":')",100);
        String[] test1 = {"Name" , "Khair"};
        assertEquals("True,$45" , graphs.bust(test1));
    }

}
