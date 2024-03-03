package Graph;

import java.util.ArrayList;

public class UndirectedWeightedGraph {
    public static class Edge{
        int src;
        int des;
        int wt;
        public Edge(int src,int des,int wt){
            this.src=src;
            this.des=des;
            this.wt=wt;
        }
    }
    public static void addVertices(ArrayList<Edge> graph[]){
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 2, 2));

        graph[2].add(new Edge(2, 0, 2));
        graph[2].add(new Edge(2, 3, -1));
        graph[2].add(new Edge(2, 1, 10));

        graph[1].add(new Edge(1, 2, 10));
        graph[1].add(new Edge(1, 3, 0));

    }
    public static void printNeighbour(ArrayList<Edge> graph[],int ver){
        for (int i = 0; i < graph[ver].size(); i++) {
            Edge e=graph[ver].get(i);
            System.out.print(e.des+" :"+e.wt+"  ");
        }
    }
    public static void main(String[] args) {
        int v=4;
        ArrayList<Edge> graph[]=new ArrayList[v];
        addVertices(graph);
        printNeighbour(graph, 2);

    }
}
