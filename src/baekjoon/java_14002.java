package baekjoon;

import java.io.*;
import java.util.*;

public class java_14002 {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      Stack<Integer> st = new Stack<>();
      StringBuilder sb = new StringBuilder();
      
      int N = Integer.parseInt(br.readLine());
      String[] input = br.readLine().split(" ");
      
      int[] arr = new int[N];
      int[] dp = new int[N];
      
      for(int i=0; i<N; i++)
         arr[i] = Integer.parseInt(input[i]);
      
      for(int i=0; i<N; i++) {
         dp[i] = 1;
         
         for(int j=0; j<i; j++) {
            if(arr[j] < arr[i] && dp[i] < dp[j] + 1) {
               dp[i] = dp[j]+1;
            }
         }
      }
      
      int max = 0;
      
      for(int i=0; i<N; i++)
         max = Math.max(max, dp[i]);
      
      sb.append(max).append("\n");
      
      int value = max;
      
      for(int i = N-1; i>=0; i--) {
         if(value == dp[i]) {
            st.push(arr[i]);
            value--;
         }
      }
      
      while(!st.isEmpty()) {
         sb.append(st.pop()).append(" ");
      }
      
      System.out.println(sb);
   }

}