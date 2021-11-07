package baekjoon;

import java.io.*;
import java.util.*;

public class java_2875 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int max = 0;
		
		for(int i=0; i<=K; i++) {
			int j = K-i;
			int Mval = M-i;
			int Nval = N-j;
			
			if(Nval < 0 || Mval < 0)
				continue;
			
			if(Nval/2 >= Mval)
				max = Math.max(max, Mval);
			else
				max = Math.max(max, Nval/2);
			
		}
		
		System.out.println(max);
	}

}
