package baekjoon;

import java.io.*;
import java.util.*;

public class java_1918 {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      Stack<Character> st = new Stack<>();
      StringBuilder sb = new StringBuilder();
      
      char[] ch = br.readLine().toCharArray();
      
      for(int i=0; i<ch.length; i++) {
         if(ch[i] >= 'A' && ch[i] <= 'Z') {
            sb.append(ch[i]);
         }
         else {
            switch(ch[i]) {
            case '*' :
            case '/' :
               while(!st.isEmpty() && (st.peek() == '*' || st.peek() == '/'))
                  sb.append(st.pop());
               st.push(ch[i]);
               break;
            case '+' :
            case '-' :
               while(!st.isEmpty() && st.peek() != '(')
                  sb.append(st.pop());
               st.push(ch[i]);
               break;
            case '(' :
               st.push(ch[i]);
               break;
            case ')' :
               while(!st.isEmpty() && st.peek() != '(')
                  sb.append(st.pop());
               st.pop();
               break;
            }
         }
         
      }
      while(!st.isEmpty())
         sb.append(st.pop());
      
      System.out.println(sb);
   }
}