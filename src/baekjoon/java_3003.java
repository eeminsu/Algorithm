package baekjoon;

import java.io.*;
import java.util.*;

public class java_3003 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] pivot = {1, 1, 2, 2, 2, 8};
		
		for(int i=0; i<pivot.length; i++) {
			System.out.print(pivot[i] - Integer.parseInt(st.nextToken()));
			if(i != pivot.length-1) System.out.print(" "); 
		}
	}
}
