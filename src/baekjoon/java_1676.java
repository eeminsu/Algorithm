package baekjoon;

import java.io.*;

public class java_1676 {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int cnt = 0;
      int val = Integer.parseInt(br.readLine());
      
      while(val >= 5) {
         cnt += val/5;
         val /= 5;
      }
      
      System.out.println(cnt);
      
   }

}