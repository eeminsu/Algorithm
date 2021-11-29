package baekjoon;

import java.io.*;
import java.util.*;

public class java_11576 {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      Stack<Integer> st = new Stack<>();
      
      String[] str = br.readLine().split(" ");
      
      int A = Integer.parseInt(str[0]);
      int B = Integer.parseInt(str[1]);
      
      int m = Integer.parseInt(br.readLine());
      
      str = br.readLine().split(" ");
      
      int sum = 0;
      
      for(int i=0; i<m; i++) {
         int val = Integer.parseInt(str[i]);
         for(int j=0; j<m-i-1; j++) {
            val *= A;
         }
         
         sum += val;
      }
      
      while(sum > 0) {
         st.push(sum % B);
         sum /= B;
      }
      while(!st.isEmpty())
         sb.append(st.pop()).append(" ");
      
      System.out.println(sb.toString().trim());
   }
}