package baekjoon;

import java.io.*;
import java.util.Arrays;

public class java_11656 {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      
      String[] str = br.readLine().split("");
      String[] arr = new String[str.length];
      Arrays.fill(arr, "");
      
      for(int i=0; i<str.length; i++) {
         for(int j=i; j<str.length; j++) {
            arr[i] += str[j];
         }
      }
      
      Arrays.sort(arr);
      
      for(int i=0; i<arr.length; i++) {
         sb.append(arr[i]).append("\n");
      }
      
      System.out.println(sb);
      
   }

}
