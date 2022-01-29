package baekjoon;

import java.io.*;
import java.util.Arrays;

public class java_11399 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N+1];
		int[] result = new int[N+1];
		
		String[] str = br.readLine().split(" ");
		
		for(int i=0; i<N; i++) {
			arr[i+1] = Integer.parseInt(str[i]);
		}
		
		Arrays.sort(arr);
		
		for(int i=1; i<=N; i++) {
			result[i] = result[i-1] + arr[i];
		}
		
		int sum = 0;
		
		for(int i=1; i<=N; i++) {
			sum += result[i];
		}
		
		System.out.println(sum);
		
	}

}
