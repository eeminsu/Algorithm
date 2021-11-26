package baekjoon;

import java.io.*;

public class java_9613 {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int N = Integer.parseInt(br.readLine());
      
      for(int i=0; i<N; i++) {
         long sum = 0;
         String[] str = br.readLine().split(" ");
         int n = Integer.parseInt(str[0]);
         
         for(int j=1; j<=n; j++) {
            for(int k=j; k<=n; k++) {
               if(k==j)
                  continue;
               int A = Integer.parseInt(str[j]);
               int B = Integer.parseInt(str[k]);
               
               sum += GCD(A,B);
            }
         }
         
         System.out.println(sum);
      }
      
   }

   public static int GCD(int A, int B) {
      if(B==0) return A;
      else return GCD(B, A%B);
   }
}