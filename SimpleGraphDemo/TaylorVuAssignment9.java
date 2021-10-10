public class TaylorVuAssignment9 {
    public static void main(String[] args){
 int[] nvalues = new int[5];
     Graph g = new Graph(5);
     Node v0 = new Node(6);
     Node v1 = new Node(4);
     Node v2 = new Node(2);
     Node v3 = new Node(1);
     Node v4 = new Node(17);

        g.insertEdge(0, 6); 
        g.insertEdge(0, 4); 
        g.insertEdge(0, 2); 
        g.insertEdge(0, 1); 
        g.insertEdge(0, 17); 
        g.insertVertex(0, v0);
        g.insertVertex(0, v1);
        g.insertVertex(0, v3);
        g.insertVertex(0,v4);
        g.outputEdges(4);
        g.outputVertex(4);
       System.out.println("Traverse Depth First of the graph staring at Vertex 3 is ");
       g.TraverseDepthFirst(3);
        System.out.println("Traverse Breadth First of the graph staring at Vertex 3 is ");
        g.TraverseBreadthFirst(3);
    for(int i = 0; i < 5; i++){
      System.out.println("vertex " + i);
      g.outputVertex(i);
      System.out.println("its edges are: ");
      g.outputEdges(i);
    }
        int graph[][] = new int[][] { { 0, 2, 0, 6, 0 }, 
                                      { 2, 0, 3, 8, 5 }, 
                                      { 0, 3, 0, 0, 7 }, 
                                      { 6, 8, 0, 0, 9 }, 
                                      { 0, 5, 7, 9, 0 } };
  System.out.println("Minimum Spanning Tree is ");
  g.MinimumSpanningTree(graph);
  System.out.println("Shortest Path is ");
  g.Shortestpath(graph, 0);
    }
    }
