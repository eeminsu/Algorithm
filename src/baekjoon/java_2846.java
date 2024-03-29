package baekjoon;

import java.io.*;
import java.util.*;

public class java_2846 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int min = arr[0];
		int max = arr[0];
		int arrMax = 0;
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] < arr[i+1]) {
				if(min > arr[i])
					min = arr[i];
				if(max < arr[i+1])
					max = arr[i+1];
			}
			else if(arr[i] >= arr[i+1]) {
				if(arrMax < max-min)
					arrMax = max-min;
	
				min = arr[i+1];
				max = 0;
			}
			if(arrMax < max-min)
				arrMax = max-min;
		}
		
		System.out.println(arrMax);
	}

}
