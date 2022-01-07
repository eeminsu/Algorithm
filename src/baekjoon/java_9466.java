package baekjoon;

import java.io.*;

public class java_9466 {

   static int[] list;
   static boolean[] visited;
   static boolean[] isFinished;
   static int cnt;
   
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int T = Integer.parseInt(br.readLine());
      
      while(T-- > 0) {
         int n = Integer.parseInt(br.readLine());
         String[] node = br.readLine().split(" ");
         
         list = new int[n];
         visited = new boolean[n];
         isFinished = new boolean[n];
         cnt = 0;
         
         
         for(int i=0; i<n; i++)
            list[i] = Integer.parseInt(node[i]) - 1;;
         
         for(int i=0; i<n; i++)
            dfs(i);
         
         System.out.println(n-cnt);
         
      }
   }
   
   public static void dfs(int start) {
      if(visited[start])
         return;
      
      visited[start] = true;
      
      int next = list[start];
      if(!visited[next]) {
         dfs(next);
      }
      else {
         if(!isFinished[next]) {
            cnt++;
            while(next != start) {
               cnt++;
               next = list[next];
            }
         }
      }
      
      isFinished[start] = true;
   }

}
