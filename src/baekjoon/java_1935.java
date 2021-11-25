package baekjoon;

import java.io.*;
import java.util.*;

public class java_1935 {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      Stack<Double> st = new Stack<>();
      
      int N = Integer.parseInt(br.readLine());
      char[] ch = br.readLine().toCharArray();
      double[] arr = new double[N];
      
      for(int i=0; i<N; i++) {
         arr[i] = Double.parseDouble(br.readLine());
      }
      
      for(int i=0; i<ch.length; i++) {
         if(ch[i] >= 'A' && ch[i] <= 'Z') {
            ch[i] = (char)(arr[ch[i]-'A'] + '0');
         }
      }
      
      for(int i=0; i<ch.length; i++) {
         if(ch[i] != '+' && ch[i] != '-' && ch[i] != '*' && ch[i] != '/') {
            st.push((double)(ch[i]-'0'));
         }
         else {
            double b = st.pop();
            double a = st.pop();
            switch(ch[i]) {
               case '+' :
                  st.push(a+b);
                  break;
               case '-' :
                  st.push(a-b);
                  break;
               case '/' :
                  st.push(a/b);
                  break;
               case '*' :
                  st.push(a*b);
                  break;
            }
         }
      }
      System.out.printf("%.2f",st.pop());
   }
}