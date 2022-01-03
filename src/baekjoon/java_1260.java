package baekjoon;

import java.io.*;
import java.util.*;

public class java_1260 {
   

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      String[] str = br.readLine().split(" ");
      
      int N = Integer.parseInt(str[0]);
      int M = Integer.parseInt(str[1]);
      int S = Integer.parseInt(str[2]);
            
      Graph g = new Graph(N);
      
      for(int i=0; i<M; i++) {
         String[] edge = br.readLine().split(" ");

         int n1 = Integer.parseInt(edge[0]) - 1;
         int n2 = Integer.parseInt(edge[1]) - 1;
         
         g.addEdge(n1, n2);
      }
      
      g.dfs(S-1);
      System.out.println();
      
      for(int i=0;i<N;i++)
         g.nodes[i].visited = false;
      
      g.bfs(S-1);
   }
   
}


class Graph{
   class Node implements Comparable<Node>{
      int data;
      LinkedList<Node> ad;
      boolean visited;
      
      Node(int data) {
         this.data = data;
         ad = new LinkedList<Node>();
         this.visited = false;
      }

      @Override
      public int compareTo(Node o) {
         if(this.data > o.data)
            return 1;
         return -1;
      }
   }
   
   Node[] nodes;
   
   public Graph(int size) {
      nodes = new Node[size];
      
      for(int i=0; i<size; i++)
         nodes[i] = new Node(i);
   }
   
   void addEdge(int n1, int n2) {
      Node node1 = nodes[n1];
      Node node2 = nodes[n2];
      
      node1.ad.add(node2);
      node2.ad.add(node1);
      
      Collections.sort(node1.ad);
      Collections.sort(node2.ad);
   }
   
   void dfs(int start) {
      Node root = nodes[start];
      root.visited = true;
      visit(root);
      
      for(Node n : root.ad) {
         if(n.visited == false)
            dfs(n.data);
      }
   }
   
   void bfs(int start) {
      Node root = nodes[start];
      root.visited = true;
      
      Queue<Node> q = new LinkedList<>();
      q.add(root);
      while(!q.isEmpty()) {
         Node r = q.poll();
         
         for(Node n : r.ad) {
            if(n.visited == false) {
               n.visited = true;
               q.add(n);
            }
         }
         visit(r);
      }
      
   }
   
   void visit(Node n) {
      System.out.print((n.data+1) + " ");
   }
}