package baekjoon;

import java.io.*;

public class java_9461 {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      
      long[] dp = new long[101];
      
      dp[1] = 1;
      dp[2] = 1;
      
      for(int i=3; i<=100; i++) {
         dp[i] = dp[i-2] + dp[i-3];
      }
      
      int T = Integer.parseInt(br.readLine());
      while(T-- > 0) {
         int N = Integer.parseInt(br.readLine());
         
         sb.append(dp[N]).append("\n");
      }
      
      System.out.println(sb);
   }

}
