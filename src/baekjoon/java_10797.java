package baekjoon;

import java.io.*;
import java.util.*;

public class java_10797 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int pivot = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		while(st.hasMoreTokens()) {
			if(pivot == Integer.parseInt(st.nextToken()))
				cnt++;
		}
		
		System.out.println(cnt);
		
	}

}
