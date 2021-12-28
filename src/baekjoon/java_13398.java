package baekjoon;

import java.io.*;

public class java_13398 {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int N = Integer.parseInt(br.readLine());
      String[] str = br.readLine().split(" ");
      
      int[] arr = new int[N];
      int[][] dp = new int[2][N];
      
      for(int i=0; i<N; i++) {
         arr[i] = Integer.parseInt(str[i]);
      }
      
      dp[0][0] = dp[1][0] = arr[0];
      int max = arr[0];
      
      for(int i=1; i<N; i++) {
         dp[0][i] = Math.max(dp[0][i-1] + arr[i], arr[i]);
         dp[1][i] = Math.max(dp[0][i-1], dp[1][i-1] + arr[i]);
         max = Math.max(max, Math.max(dp[0][i], dp[1][i]));
      }
      
      System.out.println(max);
      
   }

}