package baekjoon;

import java.io.*;

public class java_1929 {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String[] str = br.readLine().split(" ");
      StringBuilder sb = new StringBuilder();
      
      int A = Integer.parseInt(str[0]);
      int B = Integer.parseInt(str[1]);
      
      for(int i=A; i<=B; i++) {
         boolean prime = true;
         
         if(i == 1) continue;
         
         for(int j=2; j<=Math.sqrt(i); j++) {
            if(i%j == 0) {
               prime = false;
               break;
            }
         }
         
         if(prime) {
            sb.append(i).append("\n");
         }
      }
      
      System.out.println(sb);
      
   }

}