package baekjoon;

import java.io.*;

public class java_11655 {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      char[] ch = br.readLine().toCharArray();
      
      for(int i=0; i<ch.length; i++) {
         if(ch[i] >= 'A' && ch[i] <= 'Z') {
            if(ch[i] <= 'M')
               ch[i] += 13;
            else
               ch[i] -= 13;
         }
         else if(ch[i] >= 'a' && ch[i] <= 'z') {
            if(ch[i] <= 'm')
               ch[i] += 13;
            else
               ch[i] -= 13;
         }
      }
      System.out.println(ch);
   }
}