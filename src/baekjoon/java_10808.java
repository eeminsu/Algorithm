package baekjoon;

import java.io.*;

public class java_10808 {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      
      String str = br.readLine();
      int[] arr = new int[26];
      
      for(int i=0; i<str.length(); i++) {
         arr[str.charAt(i)-'a']++;
      }
      
      for(int val : arr) {
         sb.append(val).append(" ");
      }
      
      System.out.println(sb);
   }
}