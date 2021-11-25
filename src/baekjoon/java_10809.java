package baekjoon;

import java.io.*;
import java.util.Arrays;

public class java_10809 {

public static void main(String[] args) throws IOException {
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   StringBuilder sb = new StringBuilder();
   
   int[] arr = new int[26];
   boolean[] flag = new boolean[26];
   
   String str = br.readLine();
   
   Arrays.fill(arr, -1);
   
   for(int i=0; i<str.length(); i++) {
      if(flag[str.charAt(i) - 'a'] == false) {
         flag[str.charAt(i) - 'a'] = true;
         arr[str.charAt(i)-'a'] = i;
      }
   }
   
   for(int val : arr) {
      sb.append(val).append(" ");
   }
   
   System.out.println(sb);
   
}

}
