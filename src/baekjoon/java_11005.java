package baekjoon;

import java.io.*;
import java.util.*;

public class java_11005 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		while(N > 0) {
			if(N%B < 10)
				sb.append(N%B);
			else if(N%B >= 10) {
				char ch = (char)((N%B) + 55);
				sb.append(ch);
			}
			
			N /= B;
		}
		
		System.out.println(sb.reverse().toString());
	}

}
