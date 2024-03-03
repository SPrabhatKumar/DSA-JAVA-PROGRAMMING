package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class NeighboursGraph {
    public static class Edge {
        int src;
        int des;
        public Edge(int src,int des){
            this.src=src;
            this.des=des;
        }
        
    }
    public static void main(String args[]){
        int v=4;
        ArrayList<Edge> graph[]=new ArrayList[v];
        addVertices(graph);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Vertices :");
        int ver=sc.nextInt();
        printNeighbour(graph, ver);

    }
    public static void addVertices(ArrayList<Edge> graph []){
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<Edge>();

        }
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));
         
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 2));
        graph[3].add(new Edge(3, 1));
    }
    public static void printNeighbour(ArrayList<Edge> graph[],int vertices){
        for(int i=0;i<graph[vertices].size();i++){
            Edge e=graph[vertices].get(i);
            System.out.print(e.des+"  ");
        }
    }
}
