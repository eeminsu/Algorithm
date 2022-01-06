package baekjoon;

import java.io.*;
import java.util.ArrayList;

public class java_10451 {
   
   static ArrayList<Integer>[] list;
   static boolean[] visited;
   static int cnt;
   
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      
      int T = Integer.parseInt(br.readLine());
      
      while(T-- > 0) {
         int N = Integer.parseInt(br.readLine());
         String[] str = br.readLine().split(" ");
         int result = 0;
         
         list = new ArrayList[N];
         
         for(int i=0; i<N; i++) {
            list[i] = new ArrayList<Integer>();
         }
         
         for(int i=0; i<N; i++) {
            int e = Integer.parseInt(str[i]) - 1;
            
            list[i].add(e);
         }
         
         visited = new boolean[N];
         for(int i=0; i<N; i++) {
            dfs(i);
            
            if(cnt != 0)
               result++;
         }
         
         sb.append(result).append("\n");
      }
      
      System.out.println(sb);
   }
   
   public static void dfs(int start) {
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
