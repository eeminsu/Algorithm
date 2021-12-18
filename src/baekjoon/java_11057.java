package baekjoon;

import java.io.*;

public class java_11057 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		final int DIV = 10007;
		int N = Integer.parseInt(br.readLine());
		
		int[][] dp = new int[N+1][10];
		int sum = 0;
		
		for(int i=0; i<10; i++) {
			dp[1][i] = 1;
		}
		
		for(int i=2; i<=N; i++) {
			for(int j=0; j<10; j++) {
				for(int k=0; k<=j; k++) {
					dp[i][j] += dp[i-1][k];
					dp[i][j] %= DIV;
				}
			}
		}
		
		for(int i=0; i<10; i++) {
			sum += dp[N][i];
		}
		
		System.out.println(sum % DIV);
	}

}
