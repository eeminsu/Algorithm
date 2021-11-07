package baekjoon;

import java.io.*;
import java.util.*;

public class java_2455 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int val = 0;
		int max = 0;
		
		for(int i=0; i<4; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int in = Integer.parseInt(st.nextToken());
			int out = Integer.parseInt(st.nextToken());
			
			val -= in;
			val += out;
			
			if(max < val) {
				max = val;
			}
		}
		
		System.out.println(max);
		
	}

}
