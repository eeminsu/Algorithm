package baekjoon;

import java.io.*;

public class java_2004 {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String[] str = br.readLine().split(" ");
      
      long A = Long.parseLong(str[0]);
      long B = Long.parseLong(str[1]);
      
      long numTwo = two(A) - two(A-B) - two(B);
      long numFive = five(A) - five(A-B) - five(B);
      
      System.out.println(Math.min(numTwo, numFive));
      
   }
   
   public static long two(long n) {
      long count = 0;
      
      while(n >= 2) {
         count += (n/2);
         n /= 2;
      }
      
      return count;
   }
   
   public static long five(long n) {
      long count = 0;
      while(n >= 5) {
         count += (n/5);
         n /= 5;
      }
      
      return count;
   }

}