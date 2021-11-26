package baekjoon;

import java.io.*;

public class java_2609 {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      String[] str = br.readLine().split(" ");
      
      int A = Integer.parseInt(str[0]);
      int B = Integer.parseInt(str[1]);
      
      System.out.println(GCD(A,B));
      System.out.println((A*B)/GCD(A,B));
      
   }
   
   public static int GCD(int A, int B) {
      if(B == 0) return A;
      else return GCD(B, A%B);
   }

}
