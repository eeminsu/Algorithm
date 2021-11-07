package baekjoon;

import java.io.*;
import java.util.*;

public class java_2845 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int num = 1;
		
		st = new StringTokenizer(br.readLine(), " ");
		while(st.hasMoreTokens()) {
			num *= Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<5; i++) {
			System.out.print(Integer.parseInt(st.nextToken()) - num);
			if(i != 4) System.out.print(" ");
		}
	}

}
