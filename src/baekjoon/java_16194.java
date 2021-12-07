package baekjoon;

import java.io.*;

public class java_16194 {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int N = Integer.parseInt(br.readLine());
      int[] arr = new int[N+1];
      int[] dp = new int[N+1];
      
      String[] str = br.readLine().split(" ");
      
      for(int i=0; i<str.length; i++)
         arr[i+1] = Integer.parseInt(str[i]);
      
      for(int i=1; i<=N; i++) {
         dp[i] = arr[i];
         for(int j=1; j<=i; j++) {
            dp[i] = Math.min(dp[i], dp[i-j] + arr[j]);
         }
      }
      
      System.out.println(dp[N]);
      
   }

}