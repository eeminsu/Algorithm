package baekjoon;

import java.io.*;

public class java_2739 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<9; i++) {
			System.out.println(N + " * " + (i+1) + " = " + (N*(i+1)));
		}
	}

}
