package baekjoon;

import java.io.*;

public class java_10991 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<(N-1)-i; j++) {
				bw.write(" ");
			}
			for(int j=0; j<(2*i+1); j++) {
				if(j%2 == 1)
					bw.write(" ");
				else
					bw.write("*");
			}
			bw.write("\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
