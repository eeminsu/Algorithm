package baekjoon;

import java.io.*;
import java.util.*;

public class java_1707 {

   static ArrayList<Integer>[] list;
   static int[] color;
   static boolean graph;
   
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int K = Integer.parseInt(br.readLine());
      
      while(K-- > 0) {
         String[] str = br.readLine().split(" ");
         
         int V = Integer.parseInt(str[0]);
         int E = Integer.parseInt(str[1]);
         
         list = new ArrayList[V];
         color = new int[V];
         graph = true;
         
         for(int i=0; i<V; i++) {
            list[i] = new ArrayList<Integer>();
            color[i] = 0;
         }
         
         for(int i=0; i<E; i++) {
            String[] edge = br.readLine().split(" ");
            
            int e1 = Integer.parseInt(edge[0]) - 1;
            int e2 = Integer.parseInt(edge[1]) - 1;
            
            list[e1].add(e2);
            list[e2].add(e1);
         }
         
         
         for(int i=0; i<V; i++) {
            if(!graph) {
               break;
            }
            if(color[i] == 0)
               bfs(i,1);
         }
         
         System.out.println(graph? "YES" : "NO");
      }
         
   }
   
   public static void dfs(int start, int check) {
      color[start] = check;
      
      for(int val : list[start]) {
         if(color[val] == check) {
            graph = false;
            return;
         }
         else if(color[val] == 0)
            dfs(val,-check);
      }
   }
   
   public static void bfs(int start, int check) {
      Queue<Integer> q = new LinkedList<>();
      q.offer(start);
      color[start] = check;
      
      while(!q.isEmpty() && graph) {
         int val = q.poll();
         
         for(int n : list[val]) {
            if(color[n] == 0) {
               q.offer(n);
               color[n] = color[val] * -1;
            }
            else if(color[val] + color[n] != 0) {
               graph = false;
               return;
            }
         }
         
      }
   }

}