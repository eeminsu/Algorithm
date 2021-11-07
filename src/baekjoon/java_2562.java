package baekjoon;

import java.io.*;

public class java_2562 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[9];
		int index = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int max = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		
		System.out.println(max);
		System.out.println(index+1);
	}

}
