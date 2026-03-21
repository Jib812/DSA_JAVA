 import java.util.*;
public class jj {
    
    public static class Edge {
        int src;
        int dest;

        //constructor

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void bfs(ArrayList<Edge> graph[], int v) {
        Queue<Integer> q = new LinkedList<>();

        boolean visited[] = new boolean[v];
        q.add(0);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!visited[curr]) {
                System.out.println(curr+ " ");
                visited[curr] = true;
            
             for (int i = 0; i < graph[curr].size(); i++) {
                 Edge e = graph[curr].get(i);

                q.add(e.dest);

             }   


          }
        }

    }


    public static void creategraph(ArrayList<Edge> graph[]) {
        
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

    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[v];

        creategraph(graph);
        bfs(graph, v);
    }
}