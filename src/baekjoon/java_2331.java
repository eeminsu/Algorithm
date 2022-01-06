package baekjoon;

import java.io.*;
import java.util.ArrayList;

public class java_2331 {   
   
   static ArrayList<String> list;
   static int result;
   
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String[] str = br.readLine().split(" ");
      
      String A = str[0];
      int P = Integer.parseInt(str[1]);
      
      list = new ArrayList<String>();
      list.add(A);
      dfs(A, P);
      
      System.out.println(result);
   }
   
   public static void dfs(String str, int p) {
      int num = 0;
      for(int i=0; i<str.length(); i++) {
         num += Math.pow(str.charAt(i) - '0', p);
      }
      
      String numStr = String.valueOf(num);
      
      if(list.contains(numStr)) {
         result = list.indexOf(numStr);
         return;
      }
      else {
         list.add(numStr);
         dfs(numStr, p);
      }
      
   }

}

/*
public static void main(String[] args) throws IOException {
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   String[] str = br.readLine().split(" ");
   final int MAX = 295245;
   
   int A = Integer.parseInt(str[0]);
   int P = Integer.parseInt(str[1]);
   
   int cnt = 0;
   int[] arr = new int[MAX+1];
   int[] visited = new int[MAX+1];
   
   arr[0] = A;
   visited[A]++;

   for(int i=1; i<=MAX; i++) {
      if(visited[arr[i]] > 2)
         break;
      
      int n = arr[i-1];
      
      while(n>0) {
         int val = n%10;
         arr[i] += Math.pow(val, P);
         
         n /= 10;
      }
      
      visited[arr[i]]++;
   }
   
   for(int i=0; i<=MAX; i++) {
      if(visited[i] == 1)
         cnt++;
   }
   
   System.out.println(cnt);
}
*/