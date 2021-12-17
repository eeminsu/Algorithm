package baekjoon;

import java.io.*;
import java.util.Arrays;

public class java_1309 {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      final int DIV = 9901;
      
      int N = Integer.parseInt(br.readLine());
      
      int[][] dp = new int[N][3];
      
      Arrays.fill(dp[0], 1);
      
      for(int i=1; i<N; i++) {
         dp[i][0] = (dp[i-1][0] + dp[i-1][1] + dp[i-1][2]) % DIV; // 아예 없는 경우
         dp[i][1] = (dp[i-1][0] + dp[i-1][2]) % DIV; // 왼쪽방에 있을 경우
         dp[i][2] = (dp[i-1][0] + dp[i-1][1]) % DIV; // 오른쪽방에 있을 경우
      }
      
      System.out.println((dp[N-1][0] + dp[N-1][1] + dp[N-1][2]) % DIV);
      
   }

}