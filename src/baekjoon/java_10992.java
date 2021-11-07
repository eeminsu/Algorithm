package baekjoon;

import java.io.*;

public class java_10992 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<(N-1)-i; j++) {
				bw.write(" ");
			}
			for(int j=0; j<(2*(i+1))-1; j++) {
				if(i!=N-1) {
					if(j==0 || j==(2*(i+1))-1-1)
						bw.write("*");
					else
						bw.write(" ");
				}
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
