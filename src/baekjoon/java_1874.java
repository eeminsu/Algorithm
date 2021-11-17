package baekjoon;

import java.io.*;
import java.util.*;

public class java_1874 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int start = 0;
		Stack<Integer> st = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		while(N-- > 0) {
			int val = Integer.parseInt(br.readLine());
			
			if(val > start) {
				for(int i= start + 1; i<=val; i++) {
					st.push(i);
					sb.append("+").append("\n");
				}
				start = val;
			}
			else if(st.peek() != val) {
				System.out.println("NO");
				return;
			}
			
			st.pop();
			sb.append("-").append("\n");
			
		}
		
		System.out.println(sb);
	}

}
