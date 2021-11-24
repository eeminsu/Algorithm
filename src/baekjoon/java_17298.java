package baekjoon;

import java.io.*;
import java.util.*;

public class java_17298 {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      Stack<Integer> stk = new Stack<>();
      StringBuilder sb = new StringBuilder();
      
      int size = Integer.parseInt(br.readLine());
      int[] arr = new int[size];
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      
      for(int i=0; i<size; i++)
         arr[i] = Integer.parseInt(st.nextToken());
      
      
      for(int i=0; i<size; i++) {
         while(!stk.isEmpty() && arr[stk.peek()] < arr[i]) {
            arr[stk.pop()] = arr[i];
         }
         
         stk.push(i);
      }
      
      while(!stk.isEmpty()) {
         arr[stk.pop()] = -1;
      }
      
      for(int i=0; i<arr.length; i++) {
         if(i == arr.length-1)
            sb.append(arr[i]);
         else
            sb.append(arr[i]).append(" ");
      }
      
      System.out.println(sb);
      
   }

}



/* 시간초과
public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

Stack<Integer> stk = new Stack<>();
Stack<Integer> tmpStk = new Stack<>();
StringBuilder sb = new StringBuilder();

int size = Integer.parseInt(br.readLine());
String[] str = br.readLine().split(" ");

for(int i=0; i<size; i++) {
   stk.push(Integer.parseInt(str[i]));
}


for(int i=0; i<size-1; i++) {
   
   for(int j= 0; j<size-i-1; j++) {
      tmpStk.push(stk.pop());
   }
   
   boolean flag = false;
   int top = stk.peek();
   int tSize = tmpStk.size();
   
   for(int j=0; j<tSize; j++) {
      if(top < tmpStk.peek()) {
         flag = true;
         sb.append(tmpStk.peek()).append(" ");
         stk.push(tmpStk.pop());
         break;
      }
      else {
         stk.push(tmpStk.pop());
      }
   }
   
   while(!tmpStk.isEmpty())
      stk.push(tmpStk.pop());
   if(flag == false) {
      sb.append("-1 ");
   }
}
sb.append("-1");

System.out.println(sb);
}
*/