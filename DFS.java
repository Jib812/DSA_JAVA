import java.util.*;
// import javax.print.attribute.Size2DSyntax;

public class DFS {

    public static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;

        }
    }

    public static void dfs(ArrayList<Edge> graph[],int curr,boolean visited[]){
        System.out.println(curr + " ");
        visited[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (!visited[e.dest]) {
                dfs(graph, e.dest, visited);
            }
        }
    }


    public static void creategraph(ArrayList<Edge> graph[] ) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();

        }
         graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));

    }

    public static void main(String args[]) {
        int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        boolean visited[] = new boolean[v];
        
        creategraph(graph);

dfs(graph, 0, visited);

    }
}