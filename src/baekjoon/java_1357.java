package baekjoon;

import java.io.*;
import java.util.*;

public class java_1357 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int X = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());
		
		System.out.println(Rev(Rev(X)+Rev(Y)));
		
	}
	
	public static int Rev(int X) {
		StringBuilder sb = new StringBuilder();
		sb.append(X);
		
		return Integer.parseInt(sb.reverse().toString());
	}

}
