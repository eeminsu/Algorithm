package baekjoon;

import java.io.*;
import java.util.*;

public class java_11723 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int answer = 0;
		
		
		for(int i=0; i<N; i++) {
			
			String str = br.readLine();
			
			if(str.equals("all")) {
				answer |= (1 << 21) - 1;
			}
			else if(str.equals("empty")) {
				answer = 0;
			}
			else {
				StringTokenizer st = new StringTokenizer(str, " ");
				String fn = st.nextToken();
				int val = Integer.parseInt(st.nextToken());
				
				switch(fn) {
				case "add" :
					answer |= (1 << val);
					break;
				case "remove" :
					answer &= ~(1 << val);
					break;
				case "check" :
					if((answer & (1<<val)) != 0)
						sb.append(1).append("\n");
					else
						sb.append(0).append("\n");
					break;
				case "toggle" :
					answer ^= (1<<val);
					break;
				}
			}
		}
		
		System.out.println(sb);
	}

}
