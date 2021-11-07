package baekjoon;

import java.io.*;
import java.util.*;

public class java_2745 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		String N = st.nextToken();
		int sum = 0;
		int B = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<N.length(); i++) {
			int val = 0;
			if(65 <= N.charAt(i) && N.charAt(i) <= 90)
				val = N.charAt(i) - 55;
			else 
				val = N.charAt(i) - '0';
			
			for(int j=0; j<N.length()-(i+1); j++) {
				val *= B;
			}
			
			sum += val;
		}
		
		System.out.println(sum);
		
	}

}
