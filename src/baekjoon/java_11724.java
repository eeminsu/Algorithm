package baekjoon;

import java.io.*;
import java.util.*;

public class java_11724 {
   static ArrayList<Integer> list[];
   static boolean[] visited;
   static int cnt;

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      String[] str = br.readLine().split(" ");
      
      int N = Integer.parseInt(str[0]);
      int M = Integer.parseInt(str[1]);
      int result = 0;
      
      list = new ArrayList[N];
      
      for(int i=0; i<N; i++)
         list[i] = new ArrayList<>();
      
      
      for(int i=0; i<M; i++) {
         String[] edge = br.readLine().split(" ");
         
         int u = Integer.parseInt(edge[0]) - 1;
         int v = Integer.parseInt(edge[1]) - 1;
         
         list[u].add(v);
         list[v].add(u);
      }
      
      for(int i=0; i<N; i++)
         Collections.sort(list[i]);
      
      visited = new boolean[N];
      for(int i=0; i<N; i++) {
         dfs(i);
         
         if(cnt > 0)
            result++;
      }
      
      System.out.println(result);
      
   }
   
   static void dfs(int start) {
      if(!visited[start]) {
         visited[start] = true;
         cnt++;
      }
      else
         cnt = 0;
      
      for(int val : list[start]) {
         if(!visited[val]) {
            dfs(val);
         }
      }
      
   }

}