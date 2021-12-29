package baekjoon;

import java.io.*;

public class java_17404 {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int N = Integer.parseInt(br.readLine());
      int[][] arr = new int[N+1][3];
      int[][] dp = new int[N+1][3];
      
      final int INFINITE = 1001;
      
      int[] min = new int[3];
      
      for(int i=1; i<=N; i++) {
         String[] str = br.readLine().split(" ");
         
         for(int j=0; j<str.length; j++)
            arr[i][j] = Integer.parseInt(str[j]);
      }
      
      for(int i=0; i<3; i++) { // 첫번째 집이 i색일 경우
         
         for(int j=0; j<3; j++) {
            if(j==i) {
               dp[1][j] = arr[1][j]; // 첫번째 집에 i색을 칠하고
            }
            else
               dp[1][j] = INFINITE; // i색이 아닌 경우에는 색칠할 수 없으므로 1001을 대입
         }
         
         for(int k=2; k<=N; k++) {
            dp[k][0] = Math.min(dp[k-1][1], dp[k-1][2]) + arr[k][0];
            dp[k][1] = Math.min(dp[k-1][0], dp[k-1][2]) + arr[k][1];
            dp[k][2] = Math.min(dp[k-1][0], dp[k-1][1]) + arr[k][2];
            
            if(k==N) {
               if(i==0) min[i] = Math.min(dp[N][1], dp[N][2]);
               if(i==1) min[i] = Math.min(dp[N][0], dp[N][2]);
               if(i==2) min[i] = Math.min(dp[N][0], dp[N][1]);
            }
         }
         
      }

      System.out.println(Math.min(min[0], Math.min(min[1], min[2])));
   }

}