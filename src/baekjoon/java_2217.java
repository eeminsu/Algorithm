package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class java_2217 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Integer[] arr = new Integer[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		int max = 0;
		for(int i=0; i<N; i++) {
			int val = arr[i] * (i+1);
			
			if(max < val) {
				max = val;
			}
		}
		
		System.out.println(max);
		
	}

}
