package baekjoon;

import java.io.*;

public class java_2741 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long N = Long.parseLong(br.readLine());
		
		for(long i=0; i<N; i++) {
			System.out.println(i+1);
		}
	}
	
}
