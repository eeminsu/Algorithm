package baekjoon;

import java.io.*;
import java.util.*;


public class java_2475 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int sum = 0;
		
		for(int i=0; i<5; i++) {
			int n = Integer.parseInt(st.nextToken());
			sum += n*n;
		}
		
		System.out.println(sum%10);
	}

}
