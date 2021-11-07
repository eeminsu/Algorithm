package baekjoon;

import java.io.*;

public class java_2445 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<i+1; j++) {
				bw.write("*");
			}
			for(int j=0; j<2*(N-i-1); j++) {
				bw.write(" ");
			}
			for(int j=0; j<i+1; j++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		for(int i=0; i<N-1; i++) {
			for(int j=0; j<N-(i+1); j++) {
				bw.write("*");
			}
			for(int j=0; j<2*(i+1); j++) {
				bw.write(" ");
			}
			for(int j=0; j<N-(i+1); j++) {
				bw.write("*");
			}
			bw.write("\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
