package baekjoon;

import java.io.*;
import java.util.*;

public class java_10817 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] arr = new int[3];
		int temp = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] < arr[i+1]) {
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		
		System.out.println(arr[1]);
	}
}
