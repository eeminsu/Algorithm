package baekjoon;

import java.io.*;

public class java_2847 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		int result = 0;
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i=N-1; i>0; i--) {
			while(arr[i] <= arr[i-1]) {
				arr[i-1]--;
				result++;
			}
		}
		
		System.out.println(result);
	}

}
