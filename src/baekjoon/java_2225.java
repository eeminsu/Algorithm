package baekjoon;

import java.io.*;

public class java_2225 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		
		int N = Integer.parseInt(str[0]);
		int K = Integer.parseInt(str[1]);
		
		int[][] dp = new int[N+1][K+1];
		
		for(int i=1; i<=N; i++) {
			dp[i][1] = 1;
		}
		for(int i=1; i<=K; i++) {
			dp[1][i] = i;
		}
		
		for(int i=2; i<=N; i++) {
			for(int j=2; j<=K; j++) {
				dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % 1_000_000_000;
			}
		}
		
		System.out.println(dp[N][K]);
		
	}

}
