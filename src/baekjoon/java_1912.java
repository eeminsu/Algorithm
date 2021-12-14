package baekjoon;

import java.io.*;

public class java_1912 {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int N = Integer.parseInt(br.readLine());
      String[] input = br.readLine().split(" ");
      
      int[] arr = new int[N];
      int[] dp = new int[N];
      
      for(int i=0; i<N; i++) {
         arr[i] = Integer.parseInt(input[i]);
      }
      
      dp[0] = arr[0];
      int max = arr[0];
      
      for(int i=1; i<N; i++) {
         dp[i] = Math.max(dp[i-1] + arr[i], arr[i]);
         
         max = Math.max(max, dp[i]);
      }
      
      
      System.out.println(max);
      
   }

}
