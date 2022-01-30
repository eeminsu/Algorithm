package baekjoon;

import java.io.*;
import java.util.Arrays;

public class java_1449 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		
		int N = Integer.parseInt(str[0]);
		int L = Integer.parseInt(str[1]);
		
		int[] arr = new int[N];
		
		str = br.readLine().split(" ");
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		
		Arrays.sort(arr);
		
		int cnt = 1;
		double pivot = arr[0] - 0.5;
		
		for(int i=0; i<N; i++) {
			if(pivot + L  < arr[i]) {
				cnt++;
				pivot = arr[i] - 0.5;
			} 
		}
		
		System.out.println(cnt);
	}

}
