package baekjoon;

import java.io.*;

public class java_1978 {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int size = Integer.parseInt(br.readLine());
      String[] str = br.readLine().split(" ");
      int cnt = 0;
      
      for(int i=0; i<size; i++) {
         int val = Integer.parseInt(str[i]);
         boolean prime = true;
         
         if(val == 1) continue;
         
         for(int j=2; j<=Math.sqrt(val); j++) {
            if((val%j) == 0)
               prime = false;
         }
         
         if(prime) cnt++;
      }
      
      System.out.println(cnt);
      
   }

}