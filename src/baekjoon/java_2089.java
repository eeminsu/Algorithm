package baekjoon;

import java.io.*;

public class java_2089 {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      
      int N = Integer.parseInt(br.readLine());
      
      if(N == 0)
         System.out.println(0);

      while(N != 0) {
         sb.append(Math.abs(N%-2));
         N = (int)Math.ceil((double)N/-2);
      }
   
      System.out.println(sb.reverse().toString());
      
   }

}