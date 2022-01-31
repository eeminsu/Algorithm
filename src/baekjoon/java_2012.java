package baekjoon;

import java.io.*;
import java.util.Arrays;

public class java_2012 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int idx = 0;
		long result = 0;
		
		while(N-- > 0) {
			arr[idx++] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		for(int i=0; i<arr.length; i++) {
			result += Math.abs(arr[i] - (i+1));
		}
		
		System.out.println(result);
	}

}
