package baekjoon;

import java.io.*;
import java.util.*;

public class java_10093 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		
		if(A>B) {
			bw.write(String.valueOf(A-B-1));
			bw.write("\n");
			
			for(long i=B+1; i<A; i++) {
				bw.write(String.valueOf(i));
				bw.write(" ");
			}
		}
		else if(B>A) {
			bw.write(String.valueOf(B-A-1));
			bw.write("\n");
			
			for(long i=A+1; i<B; i++) {
				bw.write(String.valueOf(i));
				bw.write(" ");
			}
		}
		else if(A==B) {
			bw.write("0");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

}
