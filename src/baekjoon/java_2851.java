package baekjoon;

import java.io.*;

public class java_2851 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[10];
		int[] sum = new int[10];
		
		for(int i=0; i<arr.length; i++)
			arr[i] = Integer.parseInt(br.readLine());
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-i; j++) {
				sum[i] += arr[j];
			}
		}
		
		int min = Math.abs(100 - sum[0]);
		int answer = 0;
		
		for(int i=0; i<sum.length; i++) {
			if(min > Math.abs(100 - sum[i])) {
				min = Math.abs(100-sum[i]);
				answer = sum[i];
			}
			else if(min == Math.abs(100 - sum[i])) {
				if(answer < sum[i]) {
					answer = sum[i];
				}
			}
		}
		
		System.out.println(answer);
	}

}
