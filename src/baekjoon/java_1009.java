package baekjoon;

import java.io.*;
import java.util.*;

public class java_1009 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			long val = 1;
			
			for(int j=0; j<b; j++) {
				val = (a*val)%10;
			}
			
			if(val%10 == 0)
				System.out.println(10);
			else
				System.out.println(val%10);
		}
	}

}
