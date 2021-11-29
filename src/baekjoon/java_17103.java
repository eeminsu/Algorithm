package baekjoon;

import java.io.*;

public class java_17103 {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      
      boolean[] isPrime = new boolean[1000001];
      
      for(int i=2; i<=1000000; i++) {
         isPrime[i] = true;
      }
      for(int i=2; i<=1000000; i++) {
         for(int j=i*2; j<=1000000; j+=i) {
            if(!isPrime[j]) continue;
            isPrime[j] = false;
         }
      }
      
      int N = Integer.parseInt(br.readLine());
      
      for(int i=0; i<N; i++) {
         int val = Integer.parseInt(br.readLine());
         int cnt = 0;
         
         for(int j = 2; j <= val/2; j++) {
               if(isPrime[j] & isPrime[val-j]) {
                   cnt++;
               }
           }
         
         sb.append(cnt).append("\n");
      }
      
      System.out.println(sb);
      
   }

}
