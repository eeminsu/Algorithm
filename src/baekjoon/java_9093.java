package baekjoon;

import java.io.*;
import java.util.*;

public class java_9093 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int cnt = st.countTokens();
			
			for(int j=0; j<cnt; j++) {
				StringBuilder sb = new StringBuilder();
				sb.append(st.nextToken());
				
				System.out.print(sb.reverse());
				
				if(j<cnt-1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
