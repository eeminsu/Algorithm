package baekjoon;

import java.io.*;

public class java_1427 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int val = Integer.parseInt(br.readLine());
		int[] arr = new int[10];
		
		while(val > 0) {
			int n = val%10;
			arr[n]++;
			
			val /= 10;
		}
		
		for(int i=9; i >= 0; i--) {
			while(arr[i] > 0) {
				System.out.print(i);
				arr[i]--;
			}
		}
	}

}
