/*
*encoded an expanded version of simple graph of
*integers data structure
 */

/**
 *
 * @author Taylor Vu 
 */
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
public class Graph {
    Node vertex[];//storing the one-dimensional array of vertices
    int edge[][]; //storing the two-dimensional array of edges. The value in each cell is the edge weighting.
    int maxVerticies;//storing the maximum number of verticies
    int numberVerticies;//storing the number of verticies in graph
    public Graph(int n){//A constructor that creates a graph with a maximum number of vertices (given as parameter) and creates and initialized the fields
        vertex = new Node[n];
        edge = new int[n][n];
        maxVerticies = n;
        numberVerticies = 0;
    }
    public boolean insertVertex(int vertexNumber, Node newNode){//A method that inserts an Integral value (given as parameter) into the graph at a particular position (given as parameter)
        if(vertexNumber >= maxVerticies)
            return false;
        vertex[vertexNumber] = newNode.deepCopy();
        numberVerticies++;
        return true;
    }//end of insert vertex method
    public boolean insertEdge(int fromVertex, int toVertex){ //A method that create an edge from a vertex (given as parameter) to another vertex (given as another parameter)
        if(vertex[fromVertex] == null || vertex[toVertex] == null)
            return false;
        edge[fromVertex][toVertex] = 1;
        return true;
    }//end of insert edge method
    public void outputVertex(int vertexNumber){ //A method that output the vertex for a particular position (given as parameter
    System.out.println(vertex[vertexNumber]);
}//end of method of output of vertex
    
   /// outputEdge -- A method that outputs the edge between 2 vertices (given as parameters)
    
    public void outputEdges(int vertexNumber){//A method that outputs all the edge for a particular vertex (given as parameter)
    for(int column = 0; column < numberVerticies; column++)
    {
        if(edge[vertexNumber][column] == 1)
        System.out.println(vertexNumber + " , " + column);
    }
    }//end of method outputEdges
    public void TraverseDepthFirst(int firstVertex){ //A method that traverses the graph in depth-first order
        int v;
        Stack<Integer> stack = new Stack();
        for(int i = 0; i < numberVerticies; i++)
        {
            if(vertex[i] != null)
                vertex[i].setPushed(false);
        }
        stack.push(firstVertex);
        vertex[firstVertex].setPushed(true);
        while (!stack.empty()){
            v = stack.pop();
            vertex[v].visit();
            for(int column = 0; column < numberVerticies; column++){
                if(edge[v][column] == 1 && !vertex[column].getPushed())
                {
                    stack.push(column);
                    vertex[column].setPushed(true);
                }
               }
        }
    }// end of traverse depth first
    
    //TraverseBreadthFirst -- traverses the graph in breadth-first order
    public void TraverseBreadthFirst(int firstVertex){
        int v;
        String visited = "";
        boolean[] enqueued = new boolean[numberVerticies];
        Queue<Integer> que = new LinkedList<Integer>();
        que.add(firstVertex);
        enqueued[firstVertex] = true;
        while(! que.isEmpty()){
            v = que.poll();
            visited += vertex[v] + " ";
            for(int col = 0; col < numberVerticies; col++){
                if(edge[v][col] == 1 && enqueued[col] == false)
                    que.add(col);
                    enqueued[col] = true;
            } 
        }
    }
    //MimimumSpanningTree -- t determines the minimum spanning tree and output it (traverse in NLR order)
    int minKey(int key[], boolean set[]) 
    { 
        // Initialize min value 
        int min = Integer.MAX_VALUE, min_index = -1; 
  
        for (int v = 0; v < numberVerticies; v++) 
            if (set[v] == false && key[v] <= min) { 
                min = key[v]; 
                min_index = v; 
            } 
  
        return min_index; 
    }
    void outputMinSpanTree(int parent[], int graph[][]) 
    { 
        System.out.println("Edge \tWeight"); 
        for (int i = 1; i < numberVerticies; i++) 
            System.out.println(parent[i] + " - " + i + "\t" + graph[i][parent[i]]); 
    } 
    public void MinimumSpanningTree(int graph[][]){
        int parent[] = new int[numberVerticies];
        int key[] = new int[numberVerticies];
        boolean mstSet[] = new boolean[numberVerticies];
        for (int i = 0; i < numberVerticies; i++){
            key[i] = maxVerticies;
            mstSet[i] = false;
        }
        key[0] = 0;
        parent[0] = -1;
        for(int count = 0; count < numberVerticies - 1; count++){
            int u = minKey(key, mstSet);
            mstSet[u] = true;
            
            for(int v = 0; v < numberVerticies; v++)
                if (graph[u][v] != 0 && mstSet[v] == false && graph[u][v] < key[u]){
                parent[v] = u;
                key[v] = graph[u][v];
                }
        }
        outputMinSpanTree(parent, graph);
    }
    //ShortestPath--  that determines the shortest path between every 2 vertices in the graph and output them
     void outputPath(int distance[], int n) 
    { 
        System.out.println("Vertex   Distance from Source"); 
        for (int i = 0; i < numberVerticies; i++) 
            System.out.println(i + " tt " + distance[i]); 
    } 
    public void Shortestpath(int graph[][], int root){
        int distance[] = new int[numberVerticies];
        boolean shortpathSet[] = new boolean[numberVerticies];
        for (int i = 0; i < numberVerticies; i++){
            distance[i] = maxVerticies;
            shortpathSet[i] = false;
        }
        distance[root] = 0;
        for(int count = 0; count < numberVerticies - 1; count++){
            int u = minKey(distance, shortpathSet);
            shortpathSet[u] = true;
            for(int v = 0; v < numberVerticies; v++)
                if (!shortpathSet[v] && graph[u][v] != 0 && distance[u] != maxVerticies && distance[u] + graph[u][v] < distance[v]){
                    distance[v] = distance[u] + graph[u][v];
                }
            outputPath(distance, numberVerticies);
        }
    }
}
