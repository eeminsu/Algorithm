package baekjoon;

import java.io.*;

public class java_2010 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		
		for(int i=0; i<N; i++) {
			int val = Integer.parseInt(br.readLine());
			
			sum += val;
		}
		
		System.out.println(sum - (N-1));
	}

}
