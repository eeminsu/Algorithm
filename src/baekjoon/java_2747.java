package baekjoon;

import java.io.*;

public class java_2747 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] d = new int[45];
		d[0] = 1;
		d[1] = 1;
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=2; i<N; i++) {
			d[i] = d[i-1] + d[i-2];
		}
		
		System.out.println(d[N-1]);
	}
}
