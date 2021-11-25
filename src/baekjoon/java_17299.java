package baekjoon;

import java.io.*;
import java.util.*;

public class java_17299 {

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int N = Integer.parseInt(br.readLine());
      int[] arr = new int[N];
      int[] answer = new int[N];
      int[] cnt = new int[1000001];
      
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      Stack<Integer> stk = new Stack<>();
      StringBuilder sb = new StringBuilder();
      
      for(int i=0; i<N; i++) {
         arr[i] = Integer.parseInt(st.nextToken());
         cnt[arr[i]]++;
      }
      
      for(int i=0; i<N; i++) {
         while(!stk.isEmpty() && cnt[arr[stk.peek()]] < cnt[arr[i]]) {
            answer[stk.pop()] = arr[i];
         }
         
         stk.push(i);
      }
      
      while(!stk.isEmpty()) {
         answer[stk.pop()] = -1;
      }
      
      for(int i=0; i<arr.length; i++) {
         if(i == arr.length-1)
            sb.append(answer[i]);
         else
            sb.append(answer[i]).append(" ");
      }
      
      System.out.println(sb);
   }
}