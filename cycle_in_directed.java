import java.util.*;
public class cycle_in_directed {
    
    public static class Edge {

        int src;
        int dest;
        int weit;

        public Edge(int s, int d, int w) {

            this.src = s;
            this.dest = d;
            this.weit = w;
        }
    }
    


    public static void creategraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 2, 2));

        graph[1].add(new Edge(1, 2, 10));
        graph[1].add(new Edge(1, 3, 0));

        graph[2].add(new Edge(2, 0, 2));
        graph[2].add(new Edge(2, 1, 10));
        graph[2].add(new Edge(2, 3, -1));

        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 2, -1));

    }

    public static boolean cycle(ArrayList<Edge> graph[], boolean vis[], int curr, boolean rec[]) {
        vis[curr] = true;
        rec[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (rec[e.dest]) {
                return true;
            } else if (!vis[e.dest]) {

                if (cycle(graph, vis, e.dest, rec)) {
                    return true;
                }
            }
        }
        rec[curr] = false;
        return false;
}
    

    public static void main(String[] args) {
        
        int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        creategraph(graph);
        
        System.out.println(cycle(graph, new boolean[v], 0, new boolean[v]));
        
    }
    
}
