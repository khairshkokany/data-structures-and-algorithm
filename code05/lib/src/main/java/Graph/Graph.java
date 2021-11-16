package Graph;

import java.util.*;

public class Graph {


    private final Map<Vertices, List<Vertices>> adjacentVertex;

     Map<String , Integer> weightList = new HashMap<>();

    public Graph() {
        this.adjacentVertex =  new HashMap<>();;
    }


    public void addNode(String data) {
        Vertices vertex = new Vertices(data);
//        putIfAbsent it comes from Map Interface;
        adjacentVertex.putIfAbsent(vertex, new ArrayList<>());
    }

    public void addEdge(String Value1, String Value2) {
//        Create new Vertices Objects
        Vertices vertex1 = new Vertices(Value1);
        Vertices vertex2 = new Vertices(Value2);

        adjacentVertex.get(vertex1).add(vertex2);
        adjacentVertex.get(vertex2).add(vertex1);


    }

    public void addEdges(String Value1 , String Value2 , int val) {

        Vertices vertex1 = new Vertices(Value1);
        Vertices vertex2 = new Vertices(Value2);

        adjacentVertex.get(vertex1).add(vertex2);
        adjacentVertex.get(vertex2).add(vertex1);
        weightList.put(Value1 + Value2, val);
        weightList.put(Value2 + Value1, val);

    }

    public List<String> breadthFirstSearch(String vertex){
        List<String> visited = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(vertex);
        visited.add(vertex);

        while (!queue.isEmpty()){
            for(Vertices vertices: getNeighbors(queue.poll())){
                if (!visited.contains(vertices.data)){
                    queue.add(vertices.data);
                    visited.add(vertices.data);
                }
            }
        }
        return visited;
    }

    public String bust(String [] placeList) {
        int cost = 0;
        for (int i = 0; i < placeList.length -1; i++) {
            if (getNeighbors(placeList[i]).contains(new Vertices(placeList[i+1]))) {
                cost += weightList.get(placeList[i] +placeList[i+1]);
            } else {
                return "False,$0";
            }
        }
        return "True"+",$" + cost ;
    }

    public List<String> depthFirstSearch(String vertex) {
        List <String> visited = new ArrayList<>();
        Stack <String> stack = new Stack<>();

        stack.push(vertex);

        while (!stack.isEmpty()) {
            String string = stack.pop();
            if (!visited.contains(string)){
                visited.add(string);
                for (Vertices vertices : getNeighbors(string)) {
                    stack.push(vertices.data);
                }
            }

        }
        return visited;
    }







    public Set<Vertices> getNodes(){
        return adjacentVertex.keySet();
    }

    public List<Vertices> getNeighbors(String data) {
        return adjacentVertex.get(new Vertices(data));
    }

    public int size() {
        return adjacentVertex.size();
    }


}
