package baekjoon;

import java.io.*;
import java.util.*;

public class java_15552 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			bw.write(String.valueOf(A+B));
			bw.write("\n");
			
			
		}
		
		
		br.close();
		bw.flush();
		bw.close();
	}

}
