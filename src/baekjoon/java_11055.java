package baekjoon;

import java.io.*;

public class java_11055 {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int N = Integer.parseInt(br.readLine());
      
      int[] arr = new int[N+1];
      int[] dp = new int[N+1];
      
      String[] str = br.readLine().split(" ");
      
      for(int i=0; i<str.length; i++) {
         arr[i+1] = Integer.parseInt(str[i]);
      }
      
      int max = 0;
      
      for(int i=1; i<=N; i++) {
         dp[i] = arr[i];
         for(int j=1; j<i; j++) {
            if(arr[j]<arr[i] && dp[i] < dp[j]+arr[i]) {
               dp[i] = dp[j]+arr[i];
            }
         }
         if(max<dp[i])
            max = dp[i];
      }
      
      System.out.println(max);
      
   }

}
