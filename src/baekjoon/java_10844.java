package baekjoon;

import java.io.*;

public class java_10844 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		long[][] dp = new long[N+1][10];
		final int div = 1_000_000_000;
		
		for(int i=1; i<10; i++) {
			dp[1][i] = 1;
		}
		
		for(int i=2; i<=N; i++) {
			for(int j=0; j<10; j++) {
				if(j==0) {
					dp[i][0] = dp[i-1][1] % div;
				}
				else if(j==9) {
					dp[i][9] = dp[i-1][8] % div;
				}
				else {
					dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1]) % div;
				}
			}
		}
		
		long result = 0;
		
		for(int i=0; i<10; i++) {
			result += dp[N][i];
		}
		
		System.out.println(result % div);
		
	}

}
