package baekjoon;

import java.io.*;
import java.util.*;

public class java_8979 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int grade = 1;
		
		int[][] arr = new int[N][4];
		long[][] score = new long[N][2];
		
		for(int i=0; i<arr.length; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			score[i][0] = arr[i][0];
			score[i][1] = (arr[i][1] * 100000000000L) + (arr[i][2] * 100000L) + (arr[i][3] * 1);
		}
		
		for(int i=0; i<N; i++) {
			if(score[i][0] == K) {
				for(int j=0; j<N; j++) {
					if(score[i][1] < score[j][1]) {
						grade++;
					}
				}
				break;
			}
		}
		
		System.out.println(grade);
		
	}

}
