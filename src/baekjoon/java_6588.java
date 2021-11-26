package baekjoon;

import java.io.*;

public class java_6588 {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      boolean[] isPrime = new boolean[1000001];
      for(int i=2; i<=1000000; i++) {
         isPrime[i] = true;
      }
      for(int i=2; i<=1000000; i++) {
         for(int j=i*2; j<=1000000; j += i) {
            if(!isPrime[j]) continue;
            isPrime[j] = false;
         }
      }
      
      
      while(true) {
         int val = Integer.parseInt(br.readLine());
         if(val == 0) break;
         
         for(int i = 2; i <= val/2; i++) {
               if(isPrime[i] & isPrime[val-i]) {
                   System.out.println(val + " = " + i + " + " + (val-i));
                   break;
               }
           }
      }
   }
   
}



// 시간초과
/*
   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringBuilder sb = new StringBuilder();
      int val = 0;
      
      while((val = Integer.parseInt(br.readLine())) != 0) {
         ArrayList<Integer> list = new ArrayList<>();
         
         int A = 0;
         int B = 0;
         
         for(int i=2; i<=val; i++) {
            boolean prime = true;
            
            for(int j=2; j<=Math.sqrt(i); j++) {
               if(i%j == 0) {
                  prime = false;
                  break;
               }
            }
            
            if(prime && i%2 == 1) list.add(i);
         }
         
         
         main:
         for(int i=0; i<list.size(); i++) {
            A = list.get(i);
            int tmp = val - A;
            
            for(int j=i; j<list.size(); j++) {
               B = list.get(j);
               if(tmp == B)
                  break main;
            }
         }
         
         sb.append(val).append(" = ").append(A).append(" + ").append(B).append("\n");
         
      }
      
      System.out.println(sb);
   }
*/