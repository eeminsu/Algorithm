package baekjoon;

import java.io.*;
import java.util.Arrays;

public class java_1932 {
	
	static int N;
	static int[][] arr;
	static int[][] dp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		dp = new int[N][N];
		
		for(int i=0; i<N; i++) {
			String[] str = br.readLine().split(" ");
			Arrays.fill(dp[i], -1);
			
			for(int j=0; j<=i; j++) {
				arr[i][j] = Integer.parseInt(str[j]);
			}
		}
		
		for(int i=0; i<N; i++) {
			dp[N-1][i] = arr[N-1][i];
		}
		
		System.out.println(recursive(0,0));
		
	}
	
	static int recursive(int depth, int idx) {
		if(depth == N-1) return dp[depth][idx];
		
		if(dp[depth][idx] == -1) {
			dp[depth][idx] = Math.max(recursive(depth+1,idx), recursive(depth+1,idx+1)) + arr[depth][idx];
		}
		
		return dp[depth][idx];
	}

}
