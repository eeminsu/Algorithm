package baekjoon;

import java.io.*;
import java.util.Arrays;

public class java_1475 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[10];
		int count = 0;
		Arrays.fill(arr, 6);
		
		int N = Integer.parseInt(br.readLine());
		
		while(N>0) {
			int val = N%10;
			
			if(val==6 && arr[9] - arr[val] == 1)
				arr[9]--;
			else if(val==9 && arr[6] - arr[val] == 1)
				arr[6]--;
			else 
				arr[val]--;
			
			N/=10;
		}
		
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(min>arr[i])
				min = arr[i];
		}
		
		count = 6 - min;
		
		System.out.println(count);
	}
}
