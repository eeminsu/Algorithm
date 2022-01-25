package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class java_1026 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Integer[] A = new Integer[N];
		Integer[] B = new Integer[N];
		
		String[] str = br.readLine().split(" ");
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(str[i]);
		}
		
		str = br.readLine().split(" ");
		for(int i=0; i<N; i++) {
			B[i] = Integer.parseInt(str[i]);
		}
		
		Arrays.sort(A);
		Arrays.sort(B, Collections.reverseOrder());
		
		int result = 0;
		
		for(int i=0; i<N; i++) {
			result += A[i] * B[i];
		}
		
		System.out.println(result);
	}

}
