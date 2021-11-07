package baekjoon;

import java.io.*;
import java.util.Arrays;

public class java_2576 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[7];
		int sum = 0;
		
		Arrays.fill(arr, 101);
		
		for(int i=0; i<7; i++) {
			int N = Integer.parseInt(br.readLine());
			
			if(N%2 !=0) {
				arr[i] = N;
				sum += arr[i];
			}
		}
		
		if(sum == 0)
			System.out.println(-1);
		else {
			int min = arr[0];
			
			for(int i=0; i<arr.length; i++) {
				if(min > arr[i]) {
					min = arr[i];
				}
			}
			
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
