package baekjoon;

import java.io.*;
import java.util.*;

public class java_2490 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int[][] arr = new int[3][4];
		
		for(int i=0; i<arr.length; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
			
			int cnt = 0;
			
			for(int val : arr[i]) {
				if(val == 0)
					cnt++;
			}
			
			if(cnt == 1)
				System.out.println("A");
			else if(cnt == 2)
				System.out.println("B");
			else if(cnt == 3)
				System.out.println("C");
			else if(cnt == 4)
				System.out.println("D");
			else if(cnt == 0)
				System.out.println("E");
		}
	}

}
