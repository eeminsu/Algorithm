package baekjoon;

import java.io.*;

public class java_2439 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<(N-1)-i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<i+1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
