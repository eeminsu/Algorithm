package baekjoon;

import java.io.*;
import java.util.*;

public class java_2953 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[5];
		int index = 0;
		
		for(int i=0; i<5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
			while(st.hasMoreTokens()) {
				arr[i] += Integer.parseInt(st.nextToken());
			}
		}
		
		int max = arr[0];
		
		for(int i=0; i<5; i++) {
			if(max < arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		
		System.out.println((index+1) + " " + max);
	}

}
