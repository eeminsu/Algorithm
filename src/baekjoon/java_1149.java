package baekjoon;

import java.io.*;

public class java_1149 {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int N = Integer.parseInt(br.readLine());
      
      int[][] arr = new int[N][3];
      
      for(int i=0; i<N; i++) {
         String[] str = br.readLine().split(" ");
         
         arr[i][0] = Integer.parseInt(str[0]);
         arr[i][1] = Integer.parseInt(str[1]);
         arr[i][2] = Integer.parseInt(str[2]);
      }
      
      for(int i=1; i<N; i++) {
         arr[i][0] += Math.min(arr[i-1][1], arr[i-1][2]);
         arr[i][1] += Math.min(arr[i-1][0], arr[i-1][2]);
         arr[i][2] += Math.min(arr[i-1][0], arr[i-1][1]);
      }
      
      int answer = Math.min(Math.min(arr[N-1][0], arr[N-1][1]), arr[N-1][2]);
      
      System.out.println(answer);
      
   }

}